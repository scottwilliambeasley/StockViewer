package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jfree.data.xy.OHLCDataset;

import controller.Controller;

public class View extends JFrame {

	private MenuBar menuBar;
	private StockListingPanel stockList;
	private StockDisplayPanel displayPanel;
	private Controller controller;
	private JFileChooser chooser;

	public View(Controller controller) {
		super("Stock Monitor Beta 0.1");
		this.controller = controller;

		setWindowProperties();
		instantiateVisualComponents();
		setAllListeners();
		addVisualComponentsToLayout();
	}
	
	//  WINDOW CONFIGURATION/INSTANTIATION FUNCTIONS		

	private void addVisualComponentsToLayout() {
		add(stockList, BorderLayout.WEST);
		add(displayPanel, BorderLayout.CENTER);
		add(menuBar, BorderLayout.NORTH);
	}

	private void instantiateVisualComponents() {
		stockList = new StockListingPanel();
		displayPanel = new StockDisplayPanel();
		menuBar = new MenuBar();
	}

	private void setWindowProperties() {
		setVisible(true);
		setSize(1000, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocationRelativeTo(getParent());
		
		chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter( "Stock Monitor Database Files", "smdb"));
	}

	//	LISTENER INSTANTIATION/ASSIGNMENT FUNCTIONS
	
	private void setAllListeners() {
		setAddStockListener();
		setRemoveStockButtonListener();
		setStockListListener();
		setOpenButtonListener();
		setSaveButtonListener();

	}

	private void setRemoveStockButtonListener() {
		stockList.setRemoveStockButtonListener(new RemoveStockButtonListener() {
			
			@Override
			public void removeStock(String stock) {
				controller.removeStockFromDb(stock);
			}
		});
		
	}

	private void setOpenButtonListener() {
		menuBar.setOpenListener(new OpenButtonListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				loadDbAndStockListIfFileChosen(chooser);
			}

			private void loadDbAndStockListIfFileChosen(JFileChooser chooser) {
				if (chooser.showOpenDialog(getParent()) == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();

					try {
						controller.loadDbFromFile(file);
						loadStockListFromDb();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(getParent(),
								"Could not load profile",
								"Profile Loading Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}
			}

			private void loadStockListFromDb() {
				ArrayList<String> stockNameList = controller
						.getListOfStockNamesFromDb();
				stockList.displayNewStockList(stockNameList);
			}

		});

	}

	private void setSaveButtonListener() {
		menuBar.setSaveListener(new SaveButtonListener() {

			public void actionPerformed(ActionEvent arg0) {
				saveProfile(chooser);
			}

			private void saveProfile(JFileChooser chooser) {
				if (chooser.showSaveDialog(getParent()) == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();

					try {
						controller.saveDbToFile(file);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(getParent(),
								"Could not save profile to disk!",
								"Profile Save Error", ERROR);
					}

				}
			}

		});

	}

	private void setStockListListener() {
		StockListListener listener = new StockListListener() {

			@Override
			public void displayStockHistoryOnDisplayPanel(String stock) {
				OHLCDataset stockHistory = controller.getStockDataset(stock);
				displayPanel.showStockHistory(stockHistory, stock);
			}

		};

		stockList.setStockListListener(listener);

	}

	private void setAddStockListener() {
		stockList.setAddStockListener(new AddStockButtonListener() {

			public void addStock(String stock) {

				try {
					testStringForValidStockName(stock);
					testForStockExistenceInListingPanel(stock);
					addStockToListingAndDb(stock);
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(getParent(), e.getMessage(),
							"Cannot Add Stock", JOptionPane.ERROR_MESSAGE);
				}
			}
			
				private void testForStockExistenceInListingPanel(String stock) {
					boolean stockAlreadyExists = stockList.getStockExistence(stock);
					if (stockAlreadyExists) {
						throw new IllegalArgumentException(
								"Stock already exists in panel. Cannot add the same stock twice.");
					}
				}

				private void addStockToListingAndDb(String stock) {
					controller.addStockToDb(stock);
					stockList.addStock(stock);
				}
				
				private void testStringForValidStockName(String stock) {
				boolean stockIsValid = getStockNameValidity(stock);
				if (stockIsValid) {
				} else {
					throw new IllegalArgumentException(
							"Stock name must be composed of all capital letters.");
				}

			}

			private boolean getStockNameValidity(String stock) {
				Pattern stockPattern = Pattern.compile("^[A-Z]*$");
				Matcher match = stockPattern.matcher(stock);
				boolean stockIsValid = match.find();
				return stockIsValid;
			}

		});
	}

}

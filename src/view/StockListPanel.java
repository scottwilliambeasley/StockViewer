package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class StockListPanel extends JPanel implements ActionListener{

	private JList <String> stockList;
	private JLabel stockWatcherLabel;
	private DefaultListModel <String> listModel;
	private JButton removeStockButton;
	private StockListListener stockListListener;
	private RemoveStockButtonListener removeListener;
	private JScrollPane scrollPane;

	public StockListPanel(){
		setPanelPreferencesAndLayout();
		configureStockList();
		instantiateComponents();
		addComponentsToLayout(stockWatcherLabel, scrollPane);
	}

	private void instantiateComponents() {
		stockWatcherLabel = new JLabel("Stocks You're Watching");
		scrollPane = new JScrollPane(stockList);
		createRemoveStockButton();
	}

	private void createRemoveStockButton() {
		removeStockButton = new JButton("Remove Stock");
		removeStockButton.addActionListener(this);
	}

	private void addComponentsToLayout(JLabel stockWatcherLabel, JScrollPane scrollPane) {
		add(stockWatcherLabel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		add(removeStockButton, BorderLayout.SOUTH);
	}

	private void setPanelPreferencesAndLayout() {
		setPreferredSize(new Dimension(50,50));
		setLayout(new BorderLayout());
		setBorder();
	}

	private void configureStockList() {
		listModel = new DefaultListModel<String>();
		stockList = new JList<>();
		stockList.setModel(listModel);

		stockList.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JList list = (JList) e.getSource();
				displayStockHistoryOnPanelIfDoubleClick(e, list);
			}

			private void displayStockHistoryOnPanelIfDoubleClick(MouseEvent e, JList list) {
				if (e.getClickCount() == 2){
					String stockTicker = (String)list.getSelectedValue();
					stockListListener.displayStockHistoryOnDisplayPanel(stockTicker);
				}
			}

		});

	}

	private void setBorder() {
		Border border = BorderFactory.createTitledBorder("Stock List Panel");
		setBorder(border);
	}

	public void addStock(String stock) {
		listModel.addElement(stock);
	}

	public boolean getStockExistenceInStockList(String stock) {
		int indexNumberOfStock = listModel.indexOf(stock);

		if (indexNumberOfStock == -1){
			return false;
		}else{
			return true;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton sourceButton = (JButton) e.getSource();
		if (sourceButton == removeStockButton){

			int selectedIndex = stockList.getSelectedIndex();
			if (selectedIndex != -1){
				removeListener.removeStock(stockList.getSelectedValue());
				listModel.remove(selectedIndex);
			}
		}
	}

	public void setStockListListener(StockListListener listener){
		this.stockListListener = listener;
	}

	public void displayNewstockList(ArrayList<String> stockNameList) {
		listModel.clear();
		for (String stockName : stockNameList) {
			listModel.addElement(stockName);
		}
	}

	public void setRemoveStockButtonListener(
			RemoveStockButtonListener removeStockButtonListener) {
		removeListener = removeStockButtonListener;
	}

}

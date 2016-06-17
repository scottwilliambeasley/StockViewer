package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class StockListingPanel extends JPanel {

	private StockAdderPanel stockAdder;
	private StockListPanel stockLister;

	public StockListingPanel() {
		super();
		setPreferredSize(new Dimension(200, 0));
		setLayout(new GridBagLayout());		
		instantiateSubPanels();
		appSubPanelsToLayout();
	}

	private void appSubPanelsToLayout() {
		GridBagConstraints gbc = new GridBagConstraints(); 
		gbc.fill = gbc.BOTH;
		gbc.weightx = 1;
		
		gbc.weighty = .2;
		gbc.gridx= 0;
		gbc.gridy= 0;
		add(stockAdder, gbc);
		
		gbc.weighty = 1;
		gbc.gridx= 0;
		gbc.gridy= 1;
		add (stockLister, gbc);
	}

	private void instantiateSubPanels() {
		stockAdder = new StockAdderPanel();
		stockLister = new StockListPanel();
	}

	public void setAddStockListener(AddStockButtonListener listener) {
		stockAdder.setAddStockListener(listener);
	}

	public void setRemoveStockButtonListener(RemoveStockButtonListener removeStockButtonListener) {
		stockLister.setRemoveStockButtonListener(removeStockButtonListener);
	}

	public void addStock(String stock) {
		stockLister.addStock(stock);
	}

	public boolean getStockExistence(String stock) {
		return stockLister.getStockExistenceInStockList(stock);
	}

	public void setStockListListener(StockListListener listener) {
		stockLister.setStockListListener(listener);
		
	}

	public void displayNewStockList(ArrayList<String> stockNameList) {
		stockLister.displayNewstockList(stockNameList);		
	}


}

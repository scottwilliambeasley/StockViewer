package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class StockAdderPanel extends JPanel implements ActionListener{

	private JButton addButton;
	private AddStockButtonListener addStockButtonListener;
	private JTextField newStockTextField;
	
	public StockAdderPanel() {
		setBorderAndLayout();
		addComponentsToPanel();
	}

	private void addComponentsToPanel() {
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		add(new JLabel("Add Stock Ticker.."), gbc);
		
		gbc.gridy = 1;
		newStockTextField = new JTextField(8);
		add(newStockTextField, gbc);
	
		gbc.gridy = 2;
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		add(addButton, gbc);
	}

	private void setBorderAndLayout() {
		Border border = BorderFactory.createLineBorder(Color.YELLOW);
		setBorder(border);
		setLayout(new GridBagLayout());
	}
	
	public void setAddStockListener(AddStockButtonListener listener){
		addStockButtonListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==addButton){
			addStockFromTextField();
		}
	}

	private void addStockFromTextField() {
		if (addStockButtonListener != null){
			addStockButtonListener.addStock(newStockTextField.getText());
			newStockTextField.setText("");
		}
	}
	

	
	

}

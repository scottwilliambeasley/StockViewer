package model;

import java.io.Serializable;

import org.jfree.data.xy.OHLCDataset;

public class StockInfo implements Serializable{
	
	private String stockName;
	private OHLCDataset data;
	
	public StockInfo (String stockName, OHLCDataset data){
		this.stockName = stockName; 
		this.data = data;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public OHLCDataset getData() {
		return data;
	}

	public void setData(OHLCDataset data) {
		this.data = data;
	}

}

package model;

import java.io.Serializable;
import java.util.ArrayList;

import org.jfree.data.xy.OHLCDataset;

public class StockSet implements Serializable{

	private ArrayList <StockInfo> stockData;
	
	public StockSet(){
		stockData = new ArrayList<StockInfo> ();
	}
	
	public void addStockData(StockInfo stock){
		stockData.add(stock);
	}
	
	public void removeStockData(String stockName){
		for (StockInfo stockInfo : stockData) {
			if (stockInfo.getStockName().equals(stockName)){
				stockData.remove(stockInfo);
				break;
			}
		}
	}

	public ArrayList<StockInfo> getDb() {
		return stockData;
	}

	public OHLCDataset getStockData(String stockName) {
		//test
		System.out.println("getting stock data from db..");
		
		OHLCDataset dataset = null;
		for (StockInfo stockInfo : stockData) {
			if (stockInfo.getStockName().equals(stockName)){
				System.out.println("found stock in db..");
				dataset =  stockInfo.getData();
			}
		}
		return dataset;
	}

	public ArrayList<String> getListOfStockNames() {
		ArrayList <String> names = new ArrayList();
		
		for (StockInfo stockInfo: stockData) {
			names.add(stockInfo.getStockName());
		}
		return names;
	}
	
	
	
	
}

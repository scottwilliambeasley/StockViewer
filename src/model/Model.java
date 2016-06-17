package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;

import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.OHLCDataset;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Model {

	private StockAPI stockApi;
	private StockDbHandler dbHandler;

	public Model(){
		dbHandler = new StockDbHandler();
	}
	
//		STOCK DATABASE LOADING/SETTING FUNCTIONS
	
	public void importStockDb(File file) throws Exception {
		dbHandler.importStockDb(file);
	}

	public void exportStockDb(File file) throws IOException{	
		dbHandler.exportStockDb(file);
	}

//		STOCK ADDING/REMOVAL FUNCTIONS
	
	public void addStockToDb(String stock, OHLCDataset dataSet){
		dbHandler.addStockToDb(stock, dataSet);
	 }
	 
	 public void removeStockFromDb(String stock){
		 dbHandler.removeStockFromDb(stock);
	 }
	 
//		STOCK QUERYING FUNCTIONS

	public OHLCDataset getStockDatasetFromDb(String stockName) {
		return dbHandler.getStockDatasetFromDb(stockName);
	}

	public ArrayList<String> getListOfStockNamesFromDb() {
		return dbHandler.getListOfStockNamesFromDb();
	}
	
//		SETTING THE API THAT RETRIEVES STOCK INFO
	
	public void setStockAPI(StockAPI api){
		stockApi = api;
	}
	
//		SERVER QUERY FUNCTIONS
	
	public OHLCDataset getHistoricalDataset(String stock, int daysBack){

		//hmm the days back argument isn't presented to the db.. maybe I should fix that?
		OHLCDataset dataset = dbHandler.getStockDatasetFromDb(stock);
		if(dataset == null){
			dataset = stockApi.getHistoricalDataset(stock, daysBack);
			dbHandler.addStockToDb(stock, dataset);
		}
		return dataset;
		
	}

}

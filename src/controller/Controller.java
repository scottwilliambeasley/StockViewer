package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import model.Model;

import org.jfree.data.xy.OHLCDataset;

import yqlApi.YqlStockApi;

public class Controller {
	
	private Model model;

	public Controller(Model model) {
		this.model = model;
		model.setStockAPI(new YqlStockApi());
	}

	public OHLCDataset getHistoricalStockData(String stockSymbol, int daysBack) {
		OHLCDataset dataset = model.getHistoricalDataset(stockSymbol, daysBack);
		return dataset;
	}

//		DATABASE LOADING/SAVING FUNCTIONS
	
	public void loadDbFromFile(File file) throws Exception{
		model.importStockDb(file);
	}
	
	public void saveDbToFile(File file) throws IOException {
		model.exportStockDb(file);
	}

//		DATABASE STOCK ADDING/REMOVAL FUNCTIONS

	public void addStockToDb(String stock) {
		OHLCDataset dataset =  model.getHistoricalDataset(stock, 365);
		model.addStockToDb(stock, dataset);
	}
	
	public void removeStockFromDb(String stock) {
		model.removeStockFromDb(stock);
	}
	
//		DATABASE STOCK DATA RETRIEVAL FUNCTIONS
	
	public OHLCDataset getStockDataset(String stock){
		OHLCDataset dataset = model.getStockDatasetFromDb(stock);
		return dataset;
	}

	public ArrayList<String> getListOfStockNamesFromDb() {
		ArrayList<String> stockNames = model.getListOfStockNamesFromDb();
		return stockNames;
	}

}

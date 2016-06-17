package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.jfree.data.xy.OHLCDataset;

public class StockDbHandler {

	private StockSet stockDb;

	public StockDbHandler() {
		stockDb = new StockSet();
	}

	// STOCK DATABASE ADDING/REMOVAL FUNCTIONS

	public void importStockDb(File file) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		StockSet newDb = (StockSet) ois.readObject();
		ois.close();

		stockDb = newDb;
	}

	public void exportStockDb(File file) throws IOException {

		file = ensureFileSavedHasProperFormat(file);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				file));
		oos.writeObject(stockDb);
		oos.close();
	}

	private File ensureFileSavedHasProperFormat(File file) {

		if (file.getPath().endsWith(".smdb")) {
		}

		else {
			file = new File(file.getPath().concat(".smdb"));
		}
		return file;
	}

	// STOCK ADDING/REMOVAL FUNCTIONS

	public void addStockToDb(String stock, OHLCDataset dataSet) {
		StockInfo stockInfo = new StockInfo(stock, dataSet);
		stockDb.addStockData(stockInfo);
	}

	public void removeStockFromDb(String stock) {
		stockDb.removeStockData(stock);
	}

	// STOCK QUERYING FUNCTIONS

	public OHLCDataset getStockDatasetFromDb(String stockName) {
		return stockDb.getStockData(stockName);
	}

	public ArrayList<String> getListOfStockNamesFromDb() {
		return stockDb.getListOfStockNames();
	}

}

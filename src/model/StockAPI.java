package model;

import org.jfree.data.xy.OHLCDataset;

public interface StockAPI {

	public OHLCDataset getHistoricalDataset(String stock, int daysBack);
	
}

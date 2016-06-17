package yqlApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A class that contains the opening, closing, highest, and lowest trade values of a stock. Created to be used 
 * for containing a single instance of stock data retrieved from the YQL historical quotes database. 
 */

public class SimpleQuote {

	public static final String SYMBOL = "Symbol", 
						 DATE = "Date", 
						 OPEN = "Open",
						 HIGH = "High", 
						 LOW = "Low", 
						 CLOSE = "Close", 
						 VOLUME = "Volume",
						 ADJ_CLOSE = "Adj_Close";

	public String symbol; 
	public Date date; 
	public Double open, 
				  high, 
				  low, 
				  close, 
				  volume, 
				  adj_close;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDate(String unformattedDateString){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = null;
		try {
			date = sdf.parse(unformattedDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		setDate(date);
	}
	
	public Double getOpen() {
		return open;
	}
	public void setOpen(Double open) {
		this.open = open;
	}
	public void setOpen(String open) {
		this.open = Double.parseDouble(open);
	}
	
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public void setHigh(String high) {
		this.high = Double.parseDouble(high);
	}
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	public void setLow(String low) {
		this.low = Double.parseDouble(low);
	}
	public Double getClose() {
		return close;
	}
	public void setClose(Double close) {
		this.close = close;
	}
	public void setClose(String close) {
		this.close = Double.parseDouble(close);
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public void setVolume(String volume) {
		this.volume = Double.parseDouble(volume);
	}
	public Double getAdj_close() {
		return adj_close;
	}
	public void setAdj_close(Double adj_close) {
		this.adj_close = adj_close;
	}
	public void setAdj_close(String adj_close) {
		this.adj_close = Double.parseDouble(adj_close);
	}

	
}

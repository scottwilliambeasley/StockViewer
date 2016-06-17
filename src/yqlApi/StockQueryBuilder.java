package yqlApi;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * This class is meant to build different Query URLS, and return them
 */
public class StockQueryBuilder {
	
	private static final String yqlLocation = "https://query.yahooapis.com/v1/public/yql?q=select * from ";
	private static final String whereSymbol = "where symbol";
	private static final String finalParameters = "&format=json&diagnostics=false&env=store://datatables.org/alltableswithkeys";

	public StockQueryBuilder() {
	
	}

	public URL buildSingleStockQuery(String stockSymbol){
		String stockString = "=\"" + stockSymbol + "\"";
		String queryString = String.format(yqlLocation +"%s"+ whereSymbol +"%s"+ finalParameters,
				"yahoo.finance.quotes ",stockString );
		URL encodedUrlFromString = getEncodedUrlFromString(queryString);
		return encodedUrlFromString;
	}
	
	public URL buildStockHistoryQuery(String stockSymbol, int daysBack){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy'-'MM'-'dd");
		
		String queryString = getHistoricalQueryString(stockSymbol, daysBack, cal, dateFormatter);	

		return getEncodedUrlFromString(queryString);
		
	}
	
	private URL getEncodedUrlFromString(String queryString) {
		
		Pattern p = Pattern.compile("(.*q=select)(.*)");
		Matcher m = p.matcher(queryString);
		m.matches();
		
		String hostPath = m.group(1);
		String encodedQuery = m.group(2).replace(" ", "%20");
		String encodedUrlString = hostPath + encodedQuery;
		
		URL url = createUrl(encodedUrlString);
		
		return url;
	}

	private URL createUrl(String encodedUrlString) {
		URL url = null;		
		try {
			url = new URL(encodedUrlString);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return url;
	}

	private String getHistoricalQueryString(String stockSymbol, int daysBack, Calendar cal, SimpleDateFormat dateFormatter) {
		String today = getTodayInStringFormat(cal, dateFormatter);
		String startingDay = getStartingDayInStringFormat(daysBack, cal, dateFormatter);
		
		String queryString = formatHistoricalQuery(stockSymbol, today, startingDay);
		return queryString;
	}

	private String formatHistoricalQuery(String stockSymbol, String today, String startingDay) {
		String stockString = String.format(" in ('%s') and startDate = '%s' and endDate = '%s'", stockSymbol, startingDay, today);
		String queryString = String.format(yqlLocation +"%s"+ whereSymbol +"%s"+ finalParameters, "yahoo.finance.historicaldata ", stockString);
		return queryString;
	}

	private String getStartingDayInStringFormat(int daysBack, Calendar cal, SimpleDateFormat dateFormatter) {
		Date startingDate = getStartingDate(daysBack, cal);
		String startingDay = dateFormatter.format(startingDate);
		return startingDay;
	}

	private String getTodayInStringFormat(Calendar cal, SimpleDateFormat dateFormatter) {
		Date todaysDate = cal.getTime();
		String today = dateFormatter.format(todaysDate);
		return today;
	}

	private Date getStartingDate(int daysBack, Calendar n) {
		Date startingDate;
		n.add(Calendar.DAY_OF_MONTH, -daysBack);
		startingDate = n.getTime();
		return startingDate;
	}
	
}

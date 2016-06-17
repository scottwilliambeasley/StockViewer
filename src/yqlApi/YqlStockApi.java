package yqlApi;

import java.net.URL;
import java.util.ArrayList;

import model.StockAPI;

import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.OHLCDataset;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Connections.ConnectionRequester;

public class YqlStockApi implements StockAPI {

	private ConnectionRequester stockRequester;
	private StockQueryBuilder queryBuilder;
	private JsonQuoteParser quoteParser;
	
	public YqlStockApi() {
		stockRequester = new ConnectionRequester();
		queryBuilder = new StockQueryBuilder();
		quoteParser = new JsonQuoteParser();	
	}
	
	public OHLCDataset getHistoricalDataset(String stockSymbol, int daysBack){
		
		URL stockHistoryquery = queryBuilder.buildStockHistoryQuery(stockSymbol, daysBack);
		String response = stockRequester.getResponseFromQuery(stockHistoryquery);
		JSONArray jsonQuote = quoteParser.getListOfSingleQuotesFromParsing(response);
		ArrayList <SimpleQuote> quoteList = QuoteMapper.getListOfSimpleQuotesFromJsonArray(jsonQuote);

		OHLCDataset dataSet = getOHLCDataSetFromServer(quoteList, stockSymbol);
		
		return dataSet ;
	}
	
	 //funny.. but I am not actually using this method at all.
	public ComplexQuote getSingleStockQuote(String stock) {
		/*
		 * I can't actually isolate any of these into non-stock specific uses. This API in particular is heavily
		 * dependent on the json-simple API to parse and map the response into relevant objects.
		 * 
		 *	1.) The querybuilder creates YQL specific search strings.
		 *
		 *  2.) The connection requester actually has no specific use, it just creates connections from the 
		 *  string you give it. I could place this into a ScottUtils project and import from that instead.
		 *
		 *  3.) The quoteparser isn't actually YQL specific. In this instance, however, it's used to get
		 *  the specific node I need for further mapping.
		 *  
		 *  4.) The quotemapper utility class is also dependent on json-simple for mapping.
		 */
		
		
		//building a query URL
		URL query = queryBuilder.buildSingleStockQuery(stock);
		//connecting using the URL, getting the reponse
		String response = stockRequester.getResponseFromQuery(query);
		//parsing the json reponse and drilling down to the node that hold the fields and values.
		JSONObject jsonQuote = quoteParser.getSingleComplexQuoteFromParsing(response);
		//mapping the node tree to the object
		ComplexQuote quote = QuoteMapper.getComplexQuoteFromJson(jsonQuote);
		return quote;
	}
	
	private OHLCDataset getOHLCDataSetFromServer( ArrayList<SimpleQuote> quoteList, String stockSymbol) {
		
		ArrayList<OHLCDataItem> dataList = getOHLCDataItemArrayList(quoteList);
		
		OHLCDataItem[] requiredList = new OHLCDataItem[dataList.size()];
		requiredList = dataList.toArray(requiredList);		
		
		OHLCDataset dataset = new DefaultOHLCDataset(stockSymbol + " Stock Value", requiredList);
		
		return dataset;
	}
	
	private ArrayList<OHLCDataItem> getOHLCDataItemArrayList(ArrayList<SimpleQuote> quoteList) {
		ArrayList <OHLCDataItem >dataList = new ArrayList<>();
		
		for (SimpleQuote simpleQuote : quoteList) {
			OHLCDataItem item = new OHLCDataItem(simpleQuote.getDate(), simpleQuote.getOpen(), simpleQuote.getHigh(), simpleQuote.getLow(), simpleQuote.getClose(), simpleQuote.getVolume());
			dataList.add(item);
		}
		return dataList;
	}

	private boolean getExistenceBasedOnAskvalue(ComplexQuote quote) {

		boolean isExisting = false;

		if (quote.getAsk() != null){
			isExisting = true;
		}

		return isExisting;
	}
	
	//interestingly enough, this method never gets called
	public boolean getStockExistenceAtServer(String stock) {

		ComplexQuote quote = getSingleStockQuote(stock);

		boolean stockFound = getExistenceBasedOnAskvalue(quote);
		
		return stockFound;
	}	
	
	
	
}

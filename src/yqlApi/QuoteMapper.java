package yqlApi;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
/*
 * The purpose of this class is to return a fully mapped POJO given JSON objects containing a quotation, and mapping
 *  said POJO.
 */

public class QuoteMapper {

	public static ComplexQuote getComplexQuoteFromJson(JSONObject quote) {
		ComplexQuote quotation = new ComplexQuote();
		
		quotation.setAfterHoursChangeRealtime((String)quote.get(ComplexQuote.AFTERHOURSCHANGEREALTIME));
		quotation.setAnnualizedGain((String)quote.get(ComplexQuote.ANNUALIZEDGAIN));
		quotation.setAsk((String)quote.get(ComplexQuote.ASK));
		quotation.setAskRealtime((String)quote.get(ComplexQuote.ASKREALTIME));
		quotation.setAverageDailyVolume((String)quote.get(ComplexQuote.AVERAGEDAILYVOLUME));
		quotation.setBid((String)quote.get(ComplexQuote.BID));
		quotation.setBidRealtime((String)quote.get(ComplexQuote.BIDREALTIME));
		quotation.setBookValue((String)quote.get(ComplexQuote.BOOKVALUE));
		quotation.setChange((String)quote.get(ComplexQuote.CHANGE));
		quotation.setChangeFromFiftydayMovingAverage((String)quote.get(ComplexQuote.CHANGEFROMFIFTYDAYMOVINGAVERAGE));
		quotation.setChangeFromTwoHundreddayMovingAverage((String)quote.get(ComplexQuote.CHANGEFROMTWOHUNDREDDAYMOVINGAVERAGE));
		quotation.setChangeFromYearHigh((String)quote.get(ComplexQuote.CHANGEFROMYEARHIGH));
		quotation.setChangeFromYearLow((String)quote.get(ComplexQuote.CHANGEFROMYEARLOW));
		quotation.setChangeinPercent((String)quote.get(ComplexQuote.CHANGEINPERCENT));
		quotation.setChangePercentChange((String)quote.get(ComplexQuote.CHANGE_PERCENTCHANGE));
		quotation.setChangePercentRealtime((String)quote.get(ComplexQuote.CHANGEPERCENTREALTIME));
		quotation.setChangeRealtime((String)quote.get(ComplexQuote.CHANGEREALTIME));
		quotation.setCommission((String)quote.get(ComplexQuote.COMMISSION));
		quotation.setCurrency((String)quote.get(ComplexQuote.CURRENCY));
		quotation.setDaysHigh((String)quote.get(ComplexQuote.DAYSHIGH));
		quotation.setDaysLow((String)quote.get(ComplexQuote.DAYSLOW));
		quotation.setDaysRange((String)quote.get(ComplexQuote.DAYSRANGE));
		quotation.setDaysRangeRealtime((String)quote.get(ComplexQuote.DAYSRANGEREALTIME));
		quotation.setDaysValueChange((String)quote.get(ComplexQuote.DAYSVALUECHANGE));
		quotation.setDaysValueChangeRealtime((String)quote.get(ComplexQuote.DAYSVALUECHANGEREALTIME));
		quotation.setDividendPayDate((String)quote.get(ComplexQuote.DIVIDENTPAYDATE));
		quotation.setDividendShare((String)quote.get(ComplexQuote.DIVIDENDSHARE));
		quotation.setDividendYield((String)quote.get(ComplexQuote.DIVIDENDYIELD));
		quotation.setEarningsShare((String)quote.get(ComplexQuote.EARNINGSSHARE));
		quotation.setEBITDA((String)quote.get(ComplexQuote._EBITDA));
		quotation.setEPSEstimateCurrentYear((String)quote.get(ComplexQuote.EPSESTIMATECURRENTYEAR));
		quotation.setEPSEstimateNextQuarter((String)quote.get(ComplexQuote.EPSESTIMATENEXTQUARTER));
		quotation.setEPSEstimateNextYear((String)quote.get(ComplexQuote.EPSESTIMATENEXTYEAR));
		quotation.setErrorIndicationreturnedforsymbolchangedinvalid((String)quote.get(ComplexQuote.ERRORINDICATIONRETURNEDFORSYMBOLCHANGEDINVALID));
		quotation.setExDividendDate((String)quote.get(ComplexQuote.EXDIVIDENDDATE));
		quotation.setFiftydayMovingAverage((String)quote.get(ComplexQuote.FIFTYDAYMOVINGAVERAGE));
		quotation.setHighLimit((String)quote.get(ComplexQuote.HIGHLIMIT));
		quotation.setHoldingsGain((String)quote.get(ComplexQuote.HOLDINGSGAIN));
		quotation.setHoldingsGainPercent((String)quote.get(ComplexQuote.HOLDINGSGAINPERCENT));
		quotation.setHoldingsGainPercentRealtime((String)quote.get(ComplexQuote.HOLDINGSGAINPERCENTPERCENTREALTIME));
		quotation.setHoldingsGainRealtime((String)quote.get(ComplexQuote.HOLDINGSGAINREALTIME));
		quotation.setHoldingsValue((String)quote.get(ComplexQuote.HOLDINGSVALUE));
		quotation.setHoldingsValueRealtime((String)quote.get(ComplexQuote.HOLDINGSVALUEREALTIME));
		quotation.setLastTradeDate((String)quote.get(ComplexQuote.TRADEDATE));
		quotation.setLastTradePriceOnly((String)quote.get(ComplexQuote.LASTTRADEPRICEONLY));
		quotation.setLastTradeRealtimeWithTime((String)quote.get(ComplexQuote.LASTTRADEREALTIMEWITHTIME));
		quotation.setLastTradeTime((String)quote.get(ComplexQuote.LASTTRADETIME));
		quotation.setLowLimit((String)quote.get(ComplexQuote.LOWLIMIT));
		quotation.setMarketCapitalization((String)quote.get(ComplexQuote.MARKETCAPITALIZATION));
		quotation.setMarketCapRealtime((String)quote.get(ComplexQuote.MARKETCAPREALTIME));
		quotation.setMoreInfo((String)quote.get(ComplexQuote.MOREINFO));
		quotation.setName((String)quote.get(ComplexQuote.NAME));
		quotation.setNotes((String)quote.get(ComplexQuote.NOTES));
		quotation.setOneyrTargetPrice((String)quote.get(ComplexQuote.ONEYRTARGETPRICE));
		quotation.setOpen((String)quote.get(ComplexQuote.OPEN));
		quotation.setOrderBookRealtime((String)quote.get(ComplexQuote.ORDERBOOKREALTIME));
		quotation.setPEGRatio((String)quote.get(ComplexQuote.PEGRATIO));
		quotation.setPERatio((String)quote.get(ComplexQuote.PERATIO));
		quotation.setPERatioRealtime((String)quote.get(ComplexQuote.PERATIOREALTIME));
		quotation.setPercebtChangeFromYearHigh((String)quote.get(ComplexQuote.PERCENTCHANGEFROMYEARHIGH));
		quotation.setPercentChange((String)quote.get(ComplexQuote.PERCENTCHANGE));
		quotation.setPercentChangeFromFiftydayMovingAverage((String)quote.get(ComplexQuote.PERCENTCHANGEFROMFIFTYDAYMOVINGAVERAGE));
		quotation.setPercentChangeFromTwoHundreddayMovingAverage((String)quote.get(ComplexQuote.PERCENTCHANGEFROMTWOHUNDREDDAYMOVINGAVERAGE));
		quotation.setPercentChangeFromYearLow((String)quote.get(ComplexQuote.PERCENTCHANGEFROMYEARLOW));
		quotation.setPreviousClose((String)quote.get(ComplexQuote.PREVIOUSCLOSE));
		quotation.setPriceBook((String)quote.get(ComplexQuote.PRICEBOOK));
		quotation.setPriceEPSEstimateCurrentYear((String)quote.get(ComplexQuote.PRICEEPSESTIMATECURRENTYEAR));
		quotation.setPriceEPSEstimateNextYear((String)quote.get(ComplexQuote.PRICEEPSESTIMATENEXTYEAR));
		quotation.setPricePaid((String)quote.get(ComplexQuote.PRICEPAID));
		quotation.setPriceSales((String)quote.get(ComplexQuote.PRICESALES));
		quotation.setSharesOwned((String)quote.get(ComplexQuote.SHARESOWNED));
		quotation.setShortRatio((String)quote.get(ComplexQuote.SHORTRATIO));
		quotation.setStockExchange((String)quote.get(ComplexQuote.STOCKEXCHANGE));
		quotation.setSymbol((String)quote.get(ComplexQuote.SYMBOL));
		quotation.setTickerTrend((String)quote.get(ComplexQuote.TICKERTREND));
		quotation.setTradeDate((String)quote.get(ComplexQuote.TRADEDATE));
		quotation.setTwoHundreddayMovingAverage((String)quote.get(ComplexQuote.TWOHUNDREDDAYMOVINGAVERAGE));
		quotation.setVolume((String)quote.get(ComplexQuote.VOLUME));
		quotation.setYearHigh((String)quote.get(ComplexQuote.YEARHIGH));
		quotation.setYearLow((String)quote.get(ComplexQuote.YEARLOW));
		quotation.setYearRange((String)quote.get(ComplexQuote.YEARRANGE));
		
		return quotation;
	}
	
	public static ArrayList<SimpleQuote> getListOfSimpleQuotesFromJsonArray(JSONArray jsonarray){
		ArrayList <SimpleQuote> simpleQuoteArray = new ArrayList();
		
		for (Object object : jsonarray) {
			SimpleQuote mappedQuote = new SimpleQuote();
			
			JSONObject jsonObject = (JSONObject)object;
			mappedQuote.setAdj_close((String)jsonObject.get(SimpleQuote.ADJ_CLOSE));
			mappedQuote.setClose((String)jsonObject.get(SimpleQuote.CLOSE));
			mappedQuote.setDate((String)jsonObject.get(SimpleQuote.DATE));
			mappedQuote.setHigh((String)jsonObject.get(SimpleQuote.HIGH));
			mappedQuote.setLow((String)jsonObject.get(SimpleQuote.LOW));
			mappedQuote.setOpen((String)jsonObject.get(SimpleQuote.OPEN));
			mappedQuote.setSymbol((String)jsonObject.get(SimpleQuote.SYMBOL));
			mappedQuote.setVolume((String)jsonObject.get(SimpleQuote.VOLUME));
			
			simpleQuoteArray.add(mappedQuote);
			
		}
		
		return simpleQuoteArray;
	}
	
	public static SimpleQuote getSimpleQuoteFromJson (JSONObject quote){
		SimpleQuote quotation = new SimpleQuote();
		
		quotation.setAdj_close((Double)quote.get(SimpleQuote.ADJ_CLOSE));
		quotation.setClose((Double)quote.get(SimpleQuote.CLOSE));
		quotation.setDate((String)quote.get(SimpleQuote.DATE));
		quotation.setHigh((Double)quote.get(SimpleQuote.HIGH));
		quotation.setLow((Double)quote.get(SimpleQuote.LOW));
		quotation.setOpen((Double)quote.get(SimpleQuote.OPEN));
		quotation.setSymbol((String)quote.get(SimpleQuote.SYMBOL));
		quotation.setVolume((Double)quote.get(SimpleQuote.VOLUME));
		
		return quotation;
		
	}
	
	
}

package yqlApi;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ComplexQuote {
	
	/*
	 * NOTE TO SELF: STUDY REFLECTION API.. so that this monstrosity won't be
	 */
	
	public static final String SYMBOL = "symbol", 
			ASK = "Ask",
			AVERAGEDAILYVOLUME = "AverageDailyVolume",
			BID = "Bid",
			ASKREALTIME = "AskRealtime",
			BIDREALTIME = "BidRealtime",
			BOOKVALUE = "BookValue",
			CHANGE_PERCENTCHANGE = "Change_PercentChange",
			CHANGE = "Change",
			COMMISSION = "Commission",
			CURRENCY = "Currency",
			CHANGEREALTIME = "ChangeRealtime",
			AFTERHOURSCHANGEREALTIME = "AfterHoursChangeRealtime",
			DIVIDENDSHARE = "DividendShare",
			LASTTRADEDATE = "LastTradeDate",
			TRADEDATE = "TradeDate",
			EARNINGSSHARE = "EarningsShare",
			ERRORINDICATIONRETURNEDFORSYMBOLCHANGEDINVALID = "ErrorIndicationreturnedforsymbolchangedinvalid",
			EPSESTIMATECURRENTYEAR = "EPSEstimateCurrentYear",
			EPSESTIMATENEXTYEAR = "EPSEstimateNextYear",
			EPSESTIMATENEXTQUARTER = "EPSEstimateNextQuarter",
			DAYSLOW = "DaysLow",
			DAYSHIGH = "DaysHigh",
			YEARLOW= "YearLow",
			YEARHIGH = "YearHigh",
			HOLDINGSGAINPERCENT = "HoldingsGainPercent",
			ANNUALIZEDGAIN  = "AnnualizedGain",
			HOLDINGSGAIN = "HoldingsGain",
			HOLDINGSGAINPERCENTPERCENTREALTIME = "HoldingsGainPercentRealtime",
			HOLDINGSGAINREALTIME = "HoldingsGainRealtime",
			MOREINFO = "MoreInfo",
			ORDERBOOKREALTIME = "OrderBookRealtime",
			MARKETCAPITALIZATION = "MarketCapitalization",
			MARKETCAPREALTIME = "MarketCapRealtime",
			_EBITDA = "EBITDA",
			CHANGEFROMYEARLOW = "ChangeFromYearLow",
			PERCENTCHANGEFROMYEARLOW = "PercentChangeFromYearLow",
			LASTTRADEREALTIMEWITHTIME = "LastTradeRealtimeWithTime",
			CHANGEPERCENTREALTIME = "ChangePercentRealtime",
			CHANGEFROMYEARHIGH = "ChangeFromYearHigh",
			PERCENTCHANGEFROMYEARHIGH = "PercentChangeFromYearHigh",
			LASTTRADEWITHTIME = "LastTradeWithTime",
			LASTTRADEPRICEONLY = "LastTradePriceOnly",
			HIGHLIMIT = "HighLimit",
			LOWLIMIT = "LowLimit",
			DAYSRANGE = "DaysRange",
			DAYSRANGEREALTIME = "DaysRangeRealtime",
			FIFTYDAYMOVINGAVERAGE = "FiftydayMovingAverage",
			TWOHUNDREDDAYMOVINGAVERAGE = "TwoHundreddayMovingAverage",
			CHANGEFROMTWOHUNDREDDAYMOVINGAVERAGE = "ChangeFromTwoHundreddayMovingAverage",
			PERCENTCHANGEFROMTWOHUNDREDDAYMOVINGAVERAGE = "PercentChangeFromTwoHundreddayMovingAverage",
			CHANGEFROMFIFTYDAYMOVINGAVERAGE = "ChangeFromFiftydayMovingAverage",
			PERCENTCHANGEFROMFIFTYDAYMOVINGAVERAGE = "PercentChangeFromFiftydayMovingAverage",
			NAME = "Name",
			NOTES = "Notes",
			OPEN = "Open",
			PREVIOUSCLOSE = "PreviousClose",
			PRICEPAID = "PricePaid",
			CHANGEINPERCENT = "ChangeinPercent",
			PRICESALES = "PriceSales",
			PRICEBOOK = "PriceBook",
			EXDIVIDENDDATE = "ExDividendDate",
			PERATIO = "PERatio",
			DIVIDENTPAYDATE = "DividendPayDate",
			PERATIOREALTIME = "PERatioRealtime",
			PEGRATIO = "PEGRatio",
			PRICEEPSESTIMATECURRENTYEAR = "PriceEPSEstimateCurrentYear",
			PRICEEPSESTIMATENEXTYEAR = "PriceEPSEstimateNextYear",
			SHARESOWNED = "SharesOwned",
			SHORTRATIO= "ShortRatio",
			LASTTRADETIME = "LastTradeTime",
			TICKERTREND = "TickerTrend",
			ONEYRTARGETPRICE = "OneyrTargetPrice",
			VOLUME = "Volume",
			HOLDINGSVALUE = "HoldingsValue",
			HOLDINGSVALUEREALTIME = "HoldingsValueRealtime",
			YEARRANGE = "YearRange",
			DAYSVALUECHANGE = "DaysValueChange",
			DAYSVALUECHANGEREALTIME = "DaysValueChangeRealtime",
			STOCKEXCHANGE = "StockExchange",
			DIVIDENDYIELD = "DividendYield",
			PERCENTCHANGE = "PercentChange";

	private String AfterHoursChangeRealtime,
			AnnualizedGain,
			Ask,
			AskRealtime,
			AverageDailyVolume,
			Bid,
			BidRealtime,
			BookValue,
			Change,
			ChangeFromFiftydayMovingAverage,
			ChangeFromTwoHundreddayMovingAverage,
			ChangeFromYearHigh,
			ChangeFromYearLow,
			ChangeinPercent,
			ChangePercentChange,
			ChangePercentRealtime,
			ChangeRealtime,
			Commission,
			Currency,
			DaysHigh,
			DaysLow,
			DaysRange,
			DaysRangeRealtime,
			DaysValueChange,
			DaysValueChangeRealtime,
			DividendPayDate,
			DividendShare,
			DividendYield,
			EarningsShare,
			EBITDA,
			EPSEstimateCurrentYear,
			EPSEstimateNextQuarter,
			EPSEstimateNextYear,
			ErrorIndicationreturnedforsymbolchangedinvalid,
			ExDividendDate,
			FiftydayMovingAverage,
			HighLimit,
			HoldingsGain,
			HoldingsGainPercent,
			HoldingsGainPercentRealtime,
			HoldingsGainRealtime,
			HoldingsValue,
			HoldingsValueRealtime,
			LastTradeDate,
			LastTradePriceOnly,
			LastTradeRealtimeWithTime,
			LastTradeTime,
			LastTradeWithTime,
			LowLimit,
			MarketCapitalization,
			MarketCapRealtime,
			MoreInfo,
			Name,
			Notes,
			OneyrTargetPrice,
			Open,
			OrderBookRealtime,
			PEGRatio,
			PERatio,
			PERatioRealtime,
			PercebtChangeFromYearHigh,
			PercentChange,
			PercentChangeFromFiftydayMovingAverage,
			PercentChangeFromTwoHundreddayMovingAverage,
			PercentChangeFromYearLow,
			PreviousClose,
			PriceBook,
			PriceEPSEstimateCurrentYear,
			PriceEPSEstimateNextYear,
			PricePaid,
			PriceSales,
			SharesOwned,
			ShortRatio,
			StockExchange,
			Symbol,
			TickerTrend,
			TradeDate,
			TwoHundreddayMovingAverage,
			Volume,
			YearHigh,
			YearLow,
			YearRange;


	/**
	*
	* @return
	* The AfterHoursChangeRealtime
	*/
	public String getAfterHoursChangeRealtime() {
	return AfterHoursChangeRealtime;
	}

	/**
	*
	* @return
	* The AnnualizedGain
	*/
	public String getAnnualizedGain() {
	return AnnualizedGain;
	}

	/**
	*
	* @return
	* The Ask
	*/
	public String getAsk() {
	return Ask;
	}

	/**
	*
	* @return
	* The AskRealtime
	*/
	public String getAskRealtime() {
	return AskRealtime;
	}

	/**
	*
	* @return
	* The AverageDailyVolume
	*/
	public String getAverageDailyVolume() {
	return AverageDailyVolume;
	}

	/**
	*
	* @return
	* The Bid
	*/
	public String getBid() {
	return Bid;
	}

	/**
	*
	* @return
	* The BidRealtime
	*/
	public String getBidRealtime() {
	return BidRealtime;
	}

	/**
	*
	* @return
	* The BookValue
	*/
	public String getBookValue() {
	return BookValue;
	}

	/**
	*
	* @return
	* The Change
	*/
	public String getChange() {
	return Change;
	}

	/**
	*
	* @return
	* The ChangeFromFiftydayMovingAverage
	*/
	public String getChangeFromFiftydayMovingAverage() {
	return ChangeFromFiftydayMovingAverage;
	}

	/**
	*
	* @return
	* The ChangeFromTwoHundreddayMovingAverage
	*/
	public String getChangeFromTwoHundreddayMovingAverage() {
	return ChangeFromTwoHundreddayMovingAverage;
	}

	/**
	*
	* @return
	* The ChangeFromYearHigh
	*/
	public String getChangeFromYearHigh() {
	return ChangeFromYearHigh;
	}

	/**
	*
	* @return
	* The ChangeFromYearLow
	*/
	public String getChangeFromYearLow() {
	return ChangeFromYearLow;
	}

	/**
	*
	* @return
	* The ChangeinPercent
	*/
	public String getChangeinPercent() {
	return ChangeinPercent;
	}

	/**
	*
	* @return
	* The ChangePercentChange
	*/
	public String getChangePercentChange() {
	return ChangePercentChange;
	}

	/**
	*
	* @return
	* The ChangePercentRealtime
	*/
	public String getChangePercentRealtime() {
	return ChangePercentRealtime;
	}

	/**
	*
	* @return
	* The ChangeRealtime
	*/
	public String getChangeRealtime() {
	return ChangeRealtime;
	}

	/**
	*
	* @return
	* The Commission
	*/
	public String getCommission() {
	return Commission;
	}

	/**
	*
	* @return
	* The Currency
	*/
	public String getCurrency() {
	return Currency;
	}

	/**
	*
	* @return
	* The DaysHigh
	*/
	public String getDaysHigh() {
	return DaysHigh;
	}

	/**
	*
	* @return
	* The DaysLow
	*/
	public String getDaysLow() {
	return DaysLow;
	}

	/**
	*
	* @return
	* The DaysRange
	*/
	public String getDaysRange() {
	return DaysRange;
	}

	/**
	*
	* @return
	* The DaysRangeRealtime
	*/
	public String getDaysRangeRealtime() {
	return DaysRangeRealtime;
	}

	/**
	*
	* @return
	* The DaysValueChange
	*/
	public String getDaysValueChange() {
	return DaysValueChange;
	}

	/**
	*
	* @return
	* The DaysValueChangeRealtime
	*/
	public String getDaysValueChangeRealtime() {
	return DaysValueChangeRealtime;
	}

	/**
	*
	* @return
	* The DividendPayDate
	*/
	public String getDividendPayDate() {
	return DividendPayDate;
	}

	/**
	*
	* @return
	* The DividendShare
	*/
	public String getDividendShare() {
	return DividendShare;
	}

	/**
	*
	* @return
	* The DividendYield
	*/
	public String getDividendYield() {
	return DividendYield;
	}

	/**
	*
	* @return
	* The EarningsShare
	*/
	public String getEarningsShare() {
	return EarningsShare;
	}

	/**
	*
	* @return
	* The EBITDA
	*/
	public String getEBITDA() {
	return EBITDA;
	}

	/**
	*
	* @return
	* The EPSEstimateCurrentYear
	*/
	public String getEPSEstimateCurrentYear() {
	return EPSEstimateCurrentYear;
	}

	/**
	*
	* @return
	* The EPSEstimateNextQuarter
	*/
	public String getEPSEstimateNextQuarter() {
	return EPSEstimateNextQuarter;
	}

	/**
	*
	* @return
	* The EPSEstimateNextYear
	*/
	public String getEPSEstimateNextYear() {
	return EPSEstimateNextYear;
	}

	/**
	*
	* @return
	* The ErrorIndicationreturnedforsymbolchangedinvalid
	*/
	public String getErrorIndicationreturnedforsymbolchangedinvalid() {
	return ErrorIndicationreturnedforsymbolchangedinvalid;
	}

	/**
	*
	* @return
	* The ExDividendDate
	*/
	public String getExDividendDate() {
	return ExDividendDate;
	}

	/**
	*
	* @return
	* The FiftydayMovingAverage
	*/
	public String getFiftydayMovingAverage() {
	return FiftydayMovingAverage;
	}

	/**
	*
	* @return
	* The HighLimit
	*/
	public String getHighLimit() {
	return HighLimit;
	}

	/**
	*
	* @return
	* The HoldingsGain
	*/
	public String getHoldingsGain() {
	return HoldingsGain;
	}

	/**
	*
	* @return
	* The HoldingsGainPercent
	*/
	public String getHoldingsGainPercent() {
	return HoldingsGainPercent;
	}

	/**
	*
	* @return
	* The HoldingsGainPercentRealtime
	*/
	public String getHoldingsGainPercentRealtime() {
	return HoldingsGainPercentRealtime;
	}

	/**
	*
	* @return
	* The HoldingsGainRealtime
	*/
	public String getHoldingsGainRealtime() {
	return HoldingsGainRealtime;
	}

	/**
	*
	* @return
	* The HoldingsValue
	*/
	public String getHoldingsValue() {
	return HoldingsValue;
	}

	/**
	*
	* @return
	* The HoldingsValueRealtime
	*/
	public String getHoldingsValueRealtime() {
	return HoldingsValueRealtime;
	}

	/**
	*
	* @return
	* The LastTradeDate
	*/
	public String getLastTradeDate() {
	return LastTradeDate;
	}

	/**
	*
	* @return
	* The LastTradePriceOnly
	*/
	public String getLastTradePriceOnly() {
	return LastTradePriceOnly;
	}

	/**
	*
	* @return
	* The LastTradeRealtimeWithTime
	*/
	public String getLastTradeRealtimeWithTime() {
	return LastTradeRealtimeWithTime;
	}

	/**
	*
	* @return
	* The LastTradeTime
	*/
	public String getLastTradeTime() {
	return LastTradeTime;
	}

	/**
	*
	* @return
	* The LastTradeWithTime
	*/
	public String getLastTradeWithTime() {
	return LastTradeWithTime;
	}

	/**
	*
	* @return
	* The LowLimit
	*/
	public String getLowLimit() {
	return LowLimit;
	}

	/**
	*
	* @return
	* The MarketCapitalization
	*/
	public String getMarketCapitalization() {
	return MarketCapitalization;
	}

	/**
	*
	* @return
	* The MarketCapRealtime
	*/
	public String getMarketCapRealtime() {
	return MarketCapRealtime;
	}

	/**
	*
	* @return
	* The MoreInfo
	*/
	public String getMoreInfo() {
	return MoreInfo;
	}

	/**
	*
	* @return
	* The Name
	*/
	public String getName() {
	return Name;
	}

	/**
	*
	* @return
	* The Notes
	*/
	public String getNotes() {
	return Notes;
	}

	/**
	*
	* @return
	* The OneyrTargetPrice
	*/
	public String getOneyrTargetPrice() {
	return OneyrTargetPrice;
	}

	/**
	*
	* @return
	* The Open
	*/
	public String getOpen() {
	return Open;
	}

	/**
	*
	* @return
	* The OrderBookRealtime
	*/
	public String getOrderBookRealtime() {
	return OrderBookRealtime;
	}

	/**
	*
	* @return
	* The PEGRatio
	*/
	public String getPEGRatio() {
	return PEGRatio;
	}

	/**
	*
	* @return
	* The PERatio
	*/
	public String getPERatio() {
	return PERatio;
	}

	/**
	*
	* @return
	* The PERatioRealtime
	*/
	public String getPERatioRealtime() {
	return PERatioRealtime;
	}

	/**
	*
	* @return
	* The PercebtChangeFromYearHigh
	*/
	public String getPercebtChangeFromYearHigh() {
	return PercebtChangeFromYearHigh;
	}

	/**
	*
	* @return
	* The PercentChange
	*/
	public String getPercentChange() {
	return PercentChange;
	}

	/**
	*
	* @return
	* The PercentChangeFromFiftydayMovingAverage
	*/
	public String getPercentChangeFromFiftydayMovingAverage() {
	return PercentChangeFromFiftydayMovingAverage;
	}

	/**
	*
	* @return
	* The PercentChangeFromTwoHundreddayMovingAverage
	*/
	public String getPercentChangeFromTwoHundreddayMovingAverage() {
	return PercentChangeFromTwoHundreddayMovingAverage;
	}

	/**
	*
	* @return
	* The PercentChangeFromYearLow
	*/
	public String getPercentChangeFromYearLow() {
	return PercentChangeFromYearLow;
	}

	/**
	*
	* @return
	* The PreviousClose
	*/
	public String getPreviousClose() {
	return PreviousClose;
	}

	/**
	*
	* @return
	* The PriceBook
	*/
	public String getPriceBook() {
	return PriceBook;
	}

	/**
	*
	* @return
	* The PriceEPSEstimateCurrentYear
	*/
	public String getPriceEPSEstimateCurrentYear() {
	return PriceEPSEstimateCurrentYear;
	}

	/**
	*
	* @return
	* The PriceEPSEstimateNextYear
	*/
	public String getPriceEPSEstimateNextYear() {
	return PriceEPSEstimateNextYear;
	}

	/**
	*
	* @return
	* The PricePaid
	*/
	public String getPricePaid() {
	return PricePaid;
	}

	/**
	*
	* @return
	* The PriceSales
	*/
	public String getPriceSales() {
	return PriceSales;
	}

	/**
	*
	* @return
	* The SharesOwned
	*/
	public String getSharesOwned() {
	return SharesOwned;
	}

	/**
	*
	* @return
	* The ShortRatio
	*/
	public String getShortRatio() {
	return ShortRatio;
	}

	/**
	*
	* @return
	* The StockExchange
	*/
	public String getStockExchange() {
	return StockExchange;
	}

	/**
	*
	* @return
	* The Symbol
	*/
	public String getSymbol() {
	return Symbol;
	}

	/**
	*
	* @return
	* The TickerTrend
	*/
	public String getTickerTrend() {
	return TickerTrend;
	}

	/**
	*
	* @return
	* The TradeDate
	*/
	public String getTradeDate() {
	return TradeDate;
	}

	/**
	*
	* @return
	* The TwoHundreddayMovingAverage
	*/
	public String getTwoHundreddayMovingAverage() {
	return TwoHundreddayMovingAverage;
	}

	/**
	*
	* @return
	* The Volume
	*/
	public String getVolume() {
	return Volume;
	}

	/**
	*
	* @return
	* The YearHigh
	*/
	public String getYearHigh() {
	return YearHigh;
	}

	/**
	*
	* @return
	* The YearLow
	*/
	public String getYearLow() {
	return YearLow;
	}

	/**
	*
	* @return
	* The YearRange
	*/
	public String getYearRange() {
	return YearRange;
	}

	/**
	*
	* @param AfterHoursChangeRealtime
	* The AfterHoursChangeRealtime
	*/
	public void setAfterHoursChangeRealtime(String AfterHoursChangeRealtime) {
	this.AfterHoursChangeRealtime = AfterHoursChangeRealtime;
	}

	/**
	*
	* @param AnnualizedGain
	* The AnnualizedGain
	*/
	public void setAnnualizedGain(String AnnualizedGain) {
	this.AnnualizedGain = AnnualizedGain;
	}

	/**
	*
	* @param Ask
	* The Ask
	*/
	public void setAsk(String Ask) {
	this.Ask = Ask;
	}

	/**
	*
	* @param AskRealtime
	* The AskRealtime
	*/
	public void setAskRealtime(String AskRealtime) {
	this.AskRealtime = AskRealtime;
	}

	/**
	*
	* @param AverageDailyVolume
	* The AverageDailyVolume
	*/
	public void setAverageDailyVolume(String AverageDailyVolume) {
	this.AverageDailyVolume = AverageDailyVolume;
	}

	/**
	*
	* @param Bid
	* The Bid
	*/
	public void setBid(String Bid) {
	this.Bid = Bid;
	}

	/**
	*
	* @param BidRealtime
	* The BidRealtime
	*/
	public void setBidRealtime(String BidRealtime) {
	this.BidRealtime = BidRealtime;
	}

	/**
	*
	* @param BookValue
	* The BookValue
	*/
	public void setBookValue(String BookValue) {
	this.BookValue = BookValue;
	}

	/**
	*
	* @param Change
	* The Change
	*/
	public void setChange(String Change) {
	this.Change = Change;
	}

	/**
	*
	* @param ChangeFromFiftydayMovingAverage
	* The ChangeFromFiftydayMovingAverage
	*/
	public void setChangeFromFiftydayMovingAverage(String ChangeFromFiftydayMovingAverage) {
	this.ChangeFromFiftydayMovingAverage = ChangeFromFiftydayMovingAverage;
	}

	/**
	*
	* @param ChangeFromTwoHundreddayMovingAverage
	* The ChangeFromTwoHundreddayMovingAverage
	*/
	public void setChangeFromTwoHundreddayMovingAverage(String ChangeFromTwoHundreddayMovingAverage) {
	this.ChangeFromTwoHundreddayMovingAverage = ChangeFromTwoHundreddayMovingAverage;
	}

	/**
	*
	* @param ChangeFromYearHigh
	* The ChangeFromYearHigh
	*/
	public void setChangeFromYearHigh(String ChangeFromYearHigh) {
	this.ChangeFromYearHigh = ChangeFromYearHigh;
	}

	/**
	*
	* @param ChangeFromYearLow
	* The ChangeFromYearLow
	*/
	public void setChangeFromYearLow(String ChangeFromYearLow) {
	this.ChangeFromYearLow = ChangeFromYearLow;
	}

	/**
	*
	* @param ChangeinPercent
	* The ChangeinPercent
	*/
	public void setChangeinPercent(String ChangeinPercent) {
	this.ChangeinPercent = ChangeinPercent;
	}

	/**
	*
	* @param ChangePercentChange
	* The Change_PercentChange
	*/
	public void setChangePercentChange(String ChangePercentChange) {
	this.ChangePercentChange = ChangePercentChange;
	}

	/**
	*
	* @param ChangePercentRealtime
	* The ChangePercentRealtime
	*/
	public void setChangePercentRealtime(String ChangePercentRealtime) {
	this.ChangePercentRealtime = ChangePercentRealtime;
	}

	/**
	*
	* @param ChangeRealtime
	* The ChangeRealtime
	*/
	public void setChangeRealtime(String ChangeRealtime) {
	this.ChangeRealtime = ChangeRealtime;
	}

	/**
	*
	* @param Commission
	* The Commission
	*/
	public void setCommission(String Commission) {
	this.Commission = Commission;
	}

	/**
	*
	* @param Currency
	* The Currency
	*/
	public void setCurrency(String Currency) {
	this.Currency = Currency;
	}

	/**
	*
	* @param DaysHigh
	* The DaysHigh
	*/
	public void setDaysHigh(String DaysHigh) {
	this.DaysHigh = DaysHigh;
	}

	/**
	*
	* @param DaysLow
	* The DaysLow
	*/
	public void setDaysLow(String DaysLow) {
	this.DaysLow = DaysLow;
	}

	/**
	*
	* @param DaysRange
	* The DaysRange
	*/
	public void setDaysRange(String DaysRange) {
	this.DaysRange = DaysRange;
	}

	/**
	*
	* @param DaysRangeRealtime
	* The DaysRangeRealtime
	*/
	public void setDaysRangeRealtime(String DaysRangeRealtime) {
	this.DaysRangeRealtime = DaysRangeRealtime;
	}

	/**
	*
	* @param DaysValueChange
	* The DaysValueChange
	*/
	public void setDaysValueChange(String DaysValueChange) {
	this.DaysValueChange = DaysValueChange;
	}

	/**
	*
	* @param DaysValueChangeRealtime
	* The DaysValueChangeRealtime
	*/
	public void setDaysValueChangeRealtime(String DaysValueChangeRealtime) {
	this.DaysValueChangeRealtime = DaysValueChangeRealtime;
	}

	/**
	*
	* @param DividendPayDate
	* The DividendPayDate
	*/
	public void setDividendPayDate(String DividendPayDate) {
	this.DividendPayDate = DividendPayDate;
	}

	/**
	*
	* @param DividendShare
	* The DividendShare
	*/
	public void setDividendShare(String DividendShare) {
	this.DividendShare = DividendShare;
	}

	/**
	*
	* @param DividendYield
	* The DividendYield
	*/
	public void setDividendYield(String DividendYield) {
	this.DividendYield = DividendYield;
	}

	/**
	*
	* @param EarningsShare
	* The EarningsShare
	*/
	public void setEarningsShare(String EarningsShare) {
	this.EarningsShare = EarningsShare;
	}

	/**
	*
	* @param EBITDA
	* The EBITDA
	*/
	public void setEBITDA(String EBITDA) {
	this.EBITDA = EBITDA;
	}

	/**
	*
	* @param EPSEstimateCurrentYear
	* The EPSEstimateCurrentYear
	*/
	public void setEPSEstimateCurrentYear(String EPSEstimateCurrentYear) {
	this.EPSEstimateCurrentYear = EPSEstimateCurrentYear;
	}

	/**
	*
	* @param EPSEstimateNextQuarter
	* The EPSEstimateNextQuarter
	*/
	public void setEPSEstimateNextQuarter(String EPSEstimateNextQuarter) {
	this.EPSEstimateNextQuarter = EPSEstimateNextQuarter;
	}

	/**
	*
	* @param EPSEstimateNextYear
	* The EPSEstimateNextYear
	*/
	public void setEPSEstimateNextYear(String EPSEstimateNextYear) {
	this.EPSEstimateNextYear = EPSEstimateNextYear;
	}

	/**
	*
	* @param ErrorIndicationreturnedforsymbolchangedinvalid
	* The ErrorIndicationreturnedforsymbolchangedinvalid
	*/
	public void setErrorIndicationreturnedforsymbolchangedinvalid(String ErrorIndicationreturnedforsymbolchangedinvalid) {
	this.ErrorIndicationreturnedforsymbolchangedinvalid = ErrorIndicationreturnedforsymbolchangedinvalid;
	}

	/**
	*
	* @param ExDividendDate
	* The ExDividendDate
	*/
	public void setExDividendDate(String ExDividendDate) {
	this.ExDividendDate = ExDividendDate;
	}

	/**
	*
	* @param FiftydayMovingAverage
	* The FiftydayMovingAverage
	*/
	public void setFiftydayMovingAverage(String FiftydayMovingAverage) {
	this.FiftydayMovingAverage = FiftydayMovingAverage;
	}

	/**
	*
	* @param HighLimit
	* The HighLimit
	*/
	public void setHighLimit(String HighLimit) {
	this.HighLimit = HighLimit;
	}

	/**
	*
	* @param HoldingsGain
	* The HoldingsGain
	*/
	public void setHoldingsGain(String HoldingsGain) {
	this.HoldingsGain = HoldingsGain;
	}

	/**
	*
	* @param HoldingsGainPercent
	* The HoldingsGainPercent
	*/
	public void setHoldingsGainPercent(String HoldingsGainPercent) {
	this.HoldingsGainPercent = HoldingsGainPercent;
	}

	/**
	*
	* @param HoldingsGainPercentRealtime
	* The HoldingsGainPercentRealtime
	*/
	public void setHoldingsGainPercentRealtime(String HoldingsGainPercentRealtime) {
	this.HoldingsGainPercentRealtime = HoldingsGainPercentRealtime;
	}

	/**
	*
	* @param HoldingsGainRealtime
	* The HoldingsGainRealtime
	*/
	public void setHoldingsGainRealtime(String HoldingsGainRealtime) {
	this.HoldingsGainRealtime = HoldingsGainRealtime;
	}

	/**
	*
	* @param HoldingsValue
	* The HoldingsValue
	*/
	public void setHoldingsValue(String HoldingsValue) {
	this.HoldingsValue = HoldingsValue;
	}

	/**
	*
	* @param HoldingsValueRealtime
	* The HoldingsValueRealtime
	*/
	public void setHoldingsValueRealtime(String HoldingsValueRealtime) {
	this.HoldingsValueRealtime = HoldingsValueRealtime;
	}

	/**
	*
	* @param LastTradeDate
	* The LastTradeDate
	*/
	public void setLastTradeDate(String LastTradeDate) {
	this.LastTradeDate = LastTradeDate;
	}

	/**
	*
	* @param LastTradePriceOnly
	* The LastTradePriceOnly
	*/
	public void setLastTradePriceOnly(String LastTradePriceOnly) {
	this.LastTradePriceOnly = LastTradePriceOnly;
	}

	/**
	*
	* @param LastTradeRealtimeWithTime
	* The LastTradeRealtimeWithTime
	*/
	public void setLastTradeRealtimeWithTime(String LastTradeRealtimeWithTime) {
	this.LastTradeRealtimeWithTime = LastTradeRealtimeWithTime;
	}

	/**
	*
	* @param LastTradeTime
	* The LastTradeTime
	*/
	public void setLastTradeTime(String LastTradeTime) {
	this.LastTradeTime = LastTradeTime;
	}

	/**
	*
	* @param LastTradeWithTime
	* The LastTradeWithTime
	*/
	public void setLastTradeWithTime(String LastTradeWithTime) {
	this.LastTradeWithTime = LastTradeWithTime;
	}

	/**
	*
	* @param LowLimit
	* The LowLimit
	*/
	public void setLowLimit(String LowLimit) {
	this.LowLimit = LowLimit;
	}

	/**
	*
	* @param MarketCapitalization
	* The MarketCapitalization
	*/
	public void setMarketCapitalization(String MarketCapitalization) {
	this.MarketCapitalization = MarketCapitalization;
	}

	/**
	*
	* @param MarketCapRealtime
	* The MarketCapRealtime
	*/
	public void setMarketCapRealtime(String MarketCapRealtime) {
	this.MarketCapRealtime = MarketCapRealtime;
	}

	/**
	*
	* @param MoreInfo
	* The MoreInfo
	*/
	public void setMoreInfo(String MoreInfo) {
	this.MoreInfo = MoreInfo;
	}

	/**
	*
	* @param Name
	* The Name
	*/
	public void setName(String Name) {
	this.Name = Name;
	}

	/**
	*
	* @param Notes
	* The Notes
	*/
	public void setNotes(String Notes) {
	this.Notes = Notes;
	}

	/**
	*
	* @param OneyrTargetPrice
	* The OneyrTargetPrice
	*/
	public void setOneyrTargetPrice(String OneyrTargetPrice) {
	this.OneyrTargetPrice = OneyrTargetPrice;
	}

	/**
	*
	* @param Open
	* The Open
	*/
	public void setOpen(String Open) {
	this.Open = Open;
	}

	/**
	*
	* @param OrderBookRealtime
	* The OrderBookRealtime
	*/
	public void setOrderBookRealtime(String OrderBookRealtime) {
	this.OrderBookRealtime = OrderBookRealtime;
	}

	/**
	*
	* @param PEGRatio
	* The PEGRatio
	*/
	public void setPEGRatio(String PEGRatio) {
	this.PEGRatio = PEGRatio;
	}

	/**
	*
	* @param PERatio
	* The PERatio
	*/
	public void setPERatio(String PERatio) {
	this.PERatio = PERatio;
	}

	/**
	*
	* @param PERatioRealtime
	* The PERatioRealtime
	*/
	public void setPERatioRealtime(String PERatioRealtime) {
	this.PERatioRealtime = PERatioRealtime;
	}

	/**
	*
	* @param PercebtChangeFromYearHigh
	* The PercebtChangeFromYearHigh
	*/
	public void setPercebtChangeFromYearHigh(String PercebtChangeFromYearHigh) {
	this.PercebtChangeFromYearHigh = PercebtChangeFromYearHigh;
	}

	/**
	*
	* @param PercentChange
	* The PercentChange
	*/
	public void setPercentChange(String PercentChange) {
	this.PercentChange = PercentChange;
	}

	/**
	*
	* @param PercentChangeFromFiftydayMovingAverage
	* The PercentChangeFromFiftydayMovingAverage
	*/
	public void setPercentChangeFromFiftydayMovingAverage(String PercentChangeFromFiftydayMovingAverage) {
	this.PercentChangeFromFiftydayMovingAverage = PercentChangeFromFiftydayMovingAverage;
	}

	/**
	*
	* @param PercentChangeFromTwoHundreddayMovingAverage
	* The PercentChangeFromTwoHundreddayMovingAverage
	*/
	public void setPercentChangeFromTwoHundreddayMovingAverage(String PercentChangeFromTwoHundreddayMovingAverage) {
	this.PercentChangeFromTwoHundreddayMovingAverage = PercentChangeFromTwoHundreddayMovingAverage;
	}

	/**
	*
	* @param PercentChangeFromYearLow
	* The PercentChangeFromYearLow
	*/
	public void setPercentChangeFromYearLow(String PercentChangeFromYearLow) {
	this.PercentChangeFromYearLow = PercentChangeFromYearLow;
	}

	/**
	*
	* @param PreviousClose
	* The PreviousClose
	*/
	public void setPreviousClose(String PreviousClose) {
	this.PreviousClose = PreviousClose;
	}

	/**
	*
	* @param PriceBook
	* The PriceBook
	*/
	public void setPriceBook(String PriceBook) {
	this.PriceBook = PriceBook;
	}

	/**
	*
	* @param PriceEPSEstimateCurrentYear
	* The PriceEPSEstimateCurrentYear
	*/
	public void setPriceEPSEstimateCurrentYear(String PriceEPSEstimateCurrentYear) {
	this.PriceEPSEstimateCurrentYear = PriceEPSEstimateCurrentYear;
	}

	/**
	*
	* @param PriceEPSEstimateNextYear
	* The PriceEPSEstimateNextYear
	*/
	public void setPriceEPSEstimateNextYear(String PriceEPSEstimateNextYear) {
	this.PriceEPSEstimateNextYear = PriceEPSEstimateNextYear;
	}

	/**
	*
	* @param PricePaid
	* The PricePaid
	*/
	public void setPricePaid(String PricePaid) {
	this.PricePaid = PricePaid;
	}

	/**
	*
	* @param PriceSales
	* The PriceSales
	*/
	public void setPriceSales(String PriceSales) {
	this.PriceSales = PriceSales;
	}

	/**
	*
	* @param SharesOwned
	* The SharesOwned
	*/
	public void setSharesOwned(String SharesOwned) {
	this.SharesOwned = SharesOwned;
	}

	/**
	*
	* @param ShortRatio
	* The ShortRatio
	*/
	public void setShortRatio(String ShortRatio) {
	this.ShortRatio = ShortRatio;
	}

	/**
	*
	* @param StockExchange
	* The StockExchange
	*/
	public void setStockExchange(String StockExchange) {
	this.StockExchange = StockExchange;
	}

	/**
	*
	* @param Symbol
	* The Symbol
	*/
	public void setSymbol(String Symbol) {
	this.Symbol = Symbol;
	}

	/**
	*
	* @param TickerTrend
	* The TickerTrend
	*/
	public void setTickerTrend(String TickerTrend) {
	this.TickerTrend = TickerTrend;
	}

	/**
	*
	* @param TradeDate
	* The TradeDate
	*/
	public void setTradeDate(String TradeDate) {
	this.TradeDate = TradeDate;
	}

	/**
	*
	* @param TwoHundreddayMovingAverage
	* The TwoHundreddayMovingAverage
	*/
	public void setTwoHundreddayMovingAverage(String TwoHundreddayMovingAverage) {
	this.TwoHundreddayMovingAverage = TwoHundreddayMovingAverage;
	}

	/**
	*
	* @param Volume
	* The Volume
	*/
	public void setVolume(String Volume) {
	this.Volume = Volume;
	}

	/**
	*
	* @param YearHigh
	* The YearHigh
	*/
	public void setYearHigh(String YearHigh) {
	this.YearHigh = YearHigh;
	}

	/**
	*
	* @param YearLow
	* The YearLow
	*/
	public void setYearLow(String YearLow) {
	this.YearLow = YearLow;
	}

	/**
	*
	* @param YearRange
	* The YearRange
	*/
	public void setYearRange(String YearRange) {
	this.YearRange = YearRange;
	}

	
}
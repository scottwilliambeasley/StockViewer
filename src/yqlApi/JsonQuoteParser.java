package yqlApi;

import java.io.IOException;
import java.io.StringReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * The purpose of this class is to return one or more JSONObjects from a given response string.
 */

public class JsonQuoteParser {

	public JsonQuoteParser() {

	}
	
	public JSONObject getSingleComplexQuoteFromParsing(String response) {
		JSONParser parser = new JSONParser();
		JSONObject root = getRootElement(response, parser);
		JSONObject query = (JSONObject) root.get("query");
		JSONObject results = (JSONObject) query.get("results");
		JSONObject quote = (JSONObject) results.get("quote");
		
		return quote;
	}
	
	public JSONArray getListOfSingleQuotesFromParsing(String response){
		JSONParser parser = new JSONParser();
		JSONObject root = getRootElement(response, parser);
		JSONObject query = (JSONObject) root.get("query");
		JSONObject results = (JSONObject) query.get("results");
		JSONArray quote = (JSONArray) results.get("quote");
		
		return quote;
	}
	
	private JSONObject getRootElement(String response, JSONParser parser) {
		JSONObject root = null;
		
		try {
			root = (JSONObject) parser.parse(new StringReader(response));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		return root;
	}

}

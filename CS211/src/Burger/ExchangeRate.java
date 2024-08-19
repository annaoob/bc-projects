package Burger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ExchangeRate {

	static double rate = 1.0;
	static JSONObject myObject;

	public static double getRate(String currancyCode) throws Exception {
		try {
			String firstPartURL = "https://v6.exchangerate-api.com/v6/";
			String key = "849be640a98208d048895828";
			String thirdPartURL = "/latest/USD";
			String theURL = firstPartURL + key + thirdPartURL;

			URL url = new URL(theURL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			JSONParser jsonParser = new JSONParser();
			myObject = (JSONObject) jsonParser.parse(br);

			rate = (double) ((JSONObject) myObject.get("conversion_rates")).get(currancyCode);

		} catch (Exception ex) {
		}
		return rate;

	}
	
	
}

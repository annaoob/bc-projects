package Burger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Weather211 {

	public static double CityWeather(String cityName) throws Exception {

		double cityTemp = 0.0;

		try {
			String firstPartURL = "https://api.openweathermap.org/data/2.5/weather?q=6cea598dcf25108c021acb86912a0246";
			String secondPartURL = "&appid=6cea598dcf25108c021acb86912a0246\r\n";
			String theURL = firstPartURL + cityName + secondPartURL;
			URL url = new URL(theURL);

			/// Reads information from URL
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			// JSON parser object to parse read file
			JSONParser jsonParser = new JSONParser();
			// Read JSON file. All the data for the city is stored in "jsonObj"
			JSONObject myObject = (JSONObject) jsonParser.parse(br);

			// reading the data my addition
			cityTemp = (double) ((JSONObject) myObject.get("main")).get("temp");
			cityTemp = ((cityTemp - 273.15) * 9) / 5 + 32; // change this to separate method
		}

		catch (Exception ex) {

		}

		return cityTemp;
	}

}

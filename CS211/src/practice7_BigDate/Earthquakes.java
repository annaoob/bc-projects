/* 
 * CS211 Practice 7 (BigData)
 * Anna Koblova - anna.koblova@bellevuecollege.edu
 * Student ID: 202591729
 * 2023.04.27 - Spring Quarter
 *
 * This program says how many earthquakes happened in the last hour and prints their locations, id, and time
 */

package practice7_BigDate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Date;

public class Earthquakes {

	public static void main(String[] args) throws Exception{
		
		try {
			String browsers = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_hour.geojson";
			
			URL url = new URL (browsers);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			JSONParser jsonParser = new JSONParser();
			JSONObject myObject = (JSONObject)jsonParser.parse(br); 
			
			JSONArray features = (JSONArray)myObject.get("features");
			int count = features.size();
			//another possible way to get count:
			//long count = (long)((JSONObject) myObject.get("metadata")).get("count");
			
			System.out.println("Total EQ: " + count);
			
			for (int i = 0; i < count; i++) {
				JSONObject feature = (JSONObject)features.get(i);
				JSONObject properties = (JSONObject)feature.get("properties");
				String location = (String)properties.get("place");
				String id = (String)feature.get("id");
				long time = (Long)properties.get("time");
				Date date = new Date(time);
				System.out.printf((i+1) + ". location: %-40s id: %-15s date: %s\n", location, id, date);	
				//another possible way to print:
				//System.out.println((i + 1) + ".: location: " + location + ", id: " + id + ", date: " + date);				
			}
			
		} catch (Exception ex) {
			System.out.println(ex);
			
		}

	}

}

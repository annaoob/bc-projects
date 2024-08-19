package bounsPractice3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Temperature {
	
	private static SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
	private double temp = 0.0;
	
	{
		try {
			String browsers = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";
			
			URL url = new URL (browsers);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			JSONParser jsonParser = new JSONParser();
			JSONObject myObject = (JSONObject)jsonParser.parse(br); 
			
			JSONObject hourly = (JSONObject)myObject.get("hourly");
			JSONArray time = (JSONArray)hourly.get("time");
			JSONArray temperature = (JSONArray)hourly.get("temperature_2m");
			int count = time.size();
			Date currentDate = new Date();
			Date closest = isoFormat.parse((String)time.get(0));
			int closestIndex = 0;
			for (int i = 1; i < count; i++) {
				Date d = isoFormat.parse((String)time.get(i));
				if (d.compareTo(currentDate) >= 0) break;
				if (d.compareTo(closest) > 0) {
					closest = d;
					closestIndex = i;
				}
			}
			temp = (double)temperature.get(closestIndex);
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
		
	public double getTemp() {
		return this.temp;
	}

}

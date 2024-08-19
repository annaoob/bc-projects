package bounsPractice3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ExchangeRate {

	private double rate = 0.0;
  
	public ExchangeRate() {
		try {
			String browsers = "http://www.floatrates.com/daily/usd.json";
		
			URL url = new URL (browsers);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
			JSONParser jsonParser = new JSONParser();
			JSONObject myObject = (JSONObject)jsonParser.parse(br); 
		
			JSONObject eur = (JSONObject)myObject.get("eur");
			rate = (double) eur.get("rate");		
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	public double getRate() { 
		return this.rate;
	}
	
}

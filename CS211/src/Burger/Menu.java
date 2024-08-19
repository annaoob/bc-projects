package Burger;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

public class Menu extends Burger211 {

	String country;
	String franchise;
	double discountRate;
	String promotion;
	String currencyCode;
	String currencySymbol;
	int updatedBurgerKey = -1;
	String updatedTopping;

	static double exchangeRate;
	static double temperature;
	
	String[] localPrice = new String[getHowManyBurgers() + 1];
	String pro = "";
	
	public Menu(String country, String franchise)throws Exception {
		
		
		Locale locale = new Locale.Builder().setRegion(country).build();

		currencyCode = Currency.getInstance(locale).getCurrencyCode();
		currencySymbol = Currency.getInstance(locale).getSymbol();
		
		this.country = country;
		this.franchise = franchise;
		

		// read the exchange rate of the country;
		// ExchangeRate countryExchangeRate = new ExchangeRate();
		try {
			exchangeRate = ExchangeRate.getRate(currencyCode);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// read the weather of the franchise city;
		// Weather211 countryWeather211 = new Weather211();
		try {
			temperature = Weather211.CityWeather(franchise);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
	}

	public void Promotion(double discount, String promote) {
		discountRate = discount; 
		pro = promote;
	}

	public void PromotionTooHot(int highTemp) {
		if (temperature >= highTemp) {
			double tooHot = 0.1;
			Promotion(tooHot, "10% Discount: It's too hot!");
		}
	}

	@Override
	public void printMenu() {
		DecimalFormat df = new DecimalFormat("#,###,###.0");
		//String[] localPrice = new String[getHowManyBurgers() + 1];
		for (int i = 0; i < getHowManyBurgers(); i++) {
			localPrice[i] = df.format(getPrice(i+1) * (1 - discountRate));
			if (discountRate > 0.0) {
				localPrice[i] += "(regular: " + df.format(getPrice(i+1)) + ")";
			}
			System.out.println("franchise- " + franchise);
		}

		// call API
		new MenuGUI(franchise, pro, getName(1), currencySymbol + localPrice[0], getTopping(1), getName(2),
				currencySymbol + localPrice[1], getTopping(2), getName(3), currencySymbol + localPrice[2],
				getTopping(3), exchangeRate, temperature);

	}

	@Override
	public String getName (int key) {
		return super.getName(key);
	}
	
	
	@Override
	public double getPrice(int key) {
		return super.getPrice(key) * exchangeRate;
	}

	@Override
	public String getTopping(int key) {
		if(key ==updatedBurgerKey) {
			return (updatedTopping);
		}else {
			return super.getTopping(key);
		}
	}
	
	

	public void updateTopping(int key, String topping) {
		updatedBurgerKey = key;
		updatedTopping = topping;
		 //return getTopping(key) + topping;
	}

	/*
	 * @Override public String getName(int key) { return super.getName(key); }
	 */
	
}

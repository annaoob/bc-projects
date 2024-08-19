package bounsPractice3;

public class Germany extends Burger{

	private static double EXCHANGE_RATE = 0.0;
	String franchise = "";
	double discount = 0.0;
	
	Germany(String franchise) {
		this.franchise = franchise;
		EXCHANGE_RATE = getRate();
		Temperature t = new Temperature();
		discount = 0;
		if (t.getTemp() > 30) {
			discount = 0.5;
		} else if (t.getTemp() > 20) {
			discount = 0.25;
		} else if (t.getTemp() > 10) {
			discount = 0.1;
		}
	}
	
	@Override
	public double price() {	
		return super.price() * EXCHANGE_RATE * (1 - discount);
	}
	
	
	
}

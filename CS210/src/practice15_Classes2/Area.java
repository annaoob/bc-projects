package practice15_Classes2;

public class Area {
	
	public static double base;
	public static double height;
	
	Area (double b, double h) {
		base = b;
		height = h;
	}

	public double triangleArea() {
		double result = (base * height) / 2.0;
		return result;
	}

}

package practice16_Classes3;

public class MethodOverloading {

	public static double m(int x, double y) {
		return x + y;
	}
	
	public static double m(double x, double y) {
		return x - y;
	}
	
	public static double m(int x, int y) {
		return x % y;
	}
	
	public static void main(String[] args) {
		int a = 12;
		double b = 13;
		double c = m(a, b);
		double d = m(c, a);
		double e = m(a, (int) d);
		System.out.println("c=" + c + " d=" + d + " e=" + e);
	}

}

package practice15_Classes2;

public class AreaCalculator {

	public static void main(String[] args) {
		
		double width;
		double height;
		
		width = 10.0;
		height = 2.0;
		Area first = new Area(width, height);
		
		width = 30.0;
		height = 5.0;
		Area second = new Area(width, height);
		
		System.out.println(first.triangleArea());
		System.out.println(second.triangleArea());

	}

}

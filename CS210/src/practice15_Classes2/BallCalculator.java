package practice15_Classes2;

public class BallCalculator {

	public static void main(String[] args) {
		Ball b1 = new Ball(3);
		System.out.println(b1.size);
		Ball b2 = new Ball(b1.size);
		System.out.println(b2.size);

	}

}

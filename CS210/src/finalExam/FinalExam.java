package finalExam;

import java.util.Arrays;

public class FinalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1, 2, 3};
		int [] b = a;
		int [] c = a;
		System.out.println(Arrays.toString(a));
		b[0] = 4;
		System.out.println(Arrays.toString(b));
		c[0] = 5;
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
		
		int x = 1;
		double y = 1.0;
		double z = 2.0;
		x = A(x, (int) y);
		y = A(x, y);
		System.out.println(x + " " + y + " " + z);
		//3 4.0 2.0
		//3 4.0 2.0
		//2 3.0 2.0
		
		System.out.println();
		
		double score = 80.0;
		String grade;
		
		if (score >= 90)
			grade = "A";
		if (score >= 80)
			grade = "B";
		if (score >= 70)
			grade = "C";
		else
			grade = "F";
		
		System.out.println(grade);
		
		System.out.println();
		
		//String S = "hello world";
		//System.out.println((S.charAt(S.length())-1));

	}
	
	public static int A (int x) {
		return 'x' - 'y';
	}
	
	public static int A (int x, int y) {
		return x + y;
	}
	
	public static double A (double x, double y) {
		return x + y;
	}

}

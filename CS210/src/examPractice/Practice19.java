package examPractice;

import java.util.*;

public class Practice19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3};
		int [] B = A;
		int [] C = B;
		C[0] = A[1];
		A[1] = C[2];
		B[2] = 4;
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
		
		System.out.println();
		
		int x = 1;
		double y = 1.0;
		double z = 2.0;
		y = A(z, y);
		z = A(x, (int) y);
		System.out.println(x + " " + y + " " + z);

	}
	
	public static int A (int x, int y) {
		return x + y;
	}
	
	public static double A (double x, double y) {
		return x + y;
	}

}

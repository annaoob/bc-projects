package Practice1;

import java.util.Arrays;

public class nothing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 5, 5, 5, -1, 1, 1, 5, 5, 5, 5};
		
		int N = 11;
		int passes = 1;
		while (passes < N) {
			int index = 0;
			while (index < N-passes+1) {
				int z = N;
				if (index + (2*passes) < N) {
					z = index + (2*passes);
				}
				Merge(A, index, index + passes, z);
				index = index + (2*passes);
			}
			passes = passes * 2;
		}
		/*
		boolean has = false;
		int beginningi = 0;
		int endi = N-1;
		while (beginningi < endi && has==false) {
			int beginning = A[beginningi];
			int end = A[endi];
			if (beginning + end == 0) {
				has = true;
			}
			if ( beginning + end > 0) {
				endi = endi - 1;
			}
			if (beginning + end < 0) {
				beginningi = beginningi + 1;
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(has);
		*/
		
		boolean has = false;
		int beginningi = 0;
		int endi = N-1;
		int beginning = A[beginningi];
		int end = A[endi];
		while (beginningi < endi && has==false) {
			beginning = A[beginningi];
			end = A[endi];
			int middlei = beginningi + 1;
			int middle = A[middlei];
			while (middlei < endi && has == false) {
				middle = A[middlei];
				if (beginning + end + middle == 0) {
					has = true;
				}
				middlei = middlei + 1;
				System.out.println(beginningi);
				System.out.println(middlei);
				System.out.println(endi);
				System.out.println();
			}
			if (beginning + end + middle > 0) {
				endi = endi - 1;
			}
			if (beginning + end + middle < 0) {
				beginningi = beginningi + 1;
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(has);
		
	}
	
	public static void Merge(int[] A, int x, int y, int z) {
		int[] B = new int[11];
		int x1 = x;
		int y1 = y;
		int iB = 0;
		while (x1<y && y1<z) {
			int Ax = A[x1];
			int Ay = A[y1];
			if (Ax > Ay) {
				B[iB] = Ay;
				y1 = y1+1;
				iB=iB+1;
			} else {
				B[iB] = Ax;
				x1 = x1 + 1;
				iB = iB + 1;
			}
		}
		while (x1 < y) {
			B[iB] = A[x1];
			iB = iB + 1;
			x1 = x1 + 1;
		}
		while (y1 < z) {
			B[iB] = A[y1];
			iB = iB + 1;
			y1 = y1 + 1;
		}
		int counter = 0;
		while (counter < iB) {
			A[x + counter] = B[counter];
			counter = counter + 1;
		}
	}

}

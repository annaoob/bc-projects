package Practice1;

import java.util.Arrays;

public class nothing4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5, 5, 5, 5, -1, 1, 1, 5, 5, 5, 5};
		
		int N = 11;
		int inversions = 0;
		int passes = 1;
		while (passes < N) {
			int index = 0;
			while (index < N-passes+1) {
				int z = N;
				if (index + (2*passes) < N) {
					z = index + (2*passes);
				}
				inversions = inversions + Merge(A, index, index + passes, z);
				index = index + (2*passes);
			}
			passes = passes * 2;
		}
		System.out.println(Arrays.toString(A));
		System.out.println(inversions);

	}
	
	public static int Merge(int[] A, int x, int y, int z) {
		int[] B = new int[11];
		int x1 = x;
		int y1 = y;
		int iB = 0;
		int inversions = 0;
		while (x1<y && y1<z) {
			int Ax = A[x1];
			int Ay = A[y1];
			if (Ax > Ay) {
				B[iB] = Ay;
				y1 = y1+1;
				iB=iB+1;
				inversions = inversions + (y - x1);
				System.out.println(inversions);
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
		return inversions;
	}

}

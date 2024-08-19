package examPractice;

public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int howMany = 5;
		int[] A = new int[howMany];
		
		for (int i=0; i<A.length/2; i++) {
			A[i] = i%2;
		}
		
		for (int j=0; j<A.length; j++) {
			System.out.print(A[j]);
		}
		
		System.out.println();
		
		int y = 11;
		System.out.println(B(y));

	}
	
	public static int B(int x) {
		return 'x';
	}

}

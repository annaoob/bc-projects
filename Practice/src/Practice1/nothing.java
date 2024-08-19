package Practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class nothing {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<=7; i+=2) {
			System.out.println(i);
		}
		
		System.out.println(1/3);
		/*
		ArrayList <Double> A = new ArrayList<>();
		int howMuch = 1;
		int L = 5;
		int cups = 10;
		int rows = 0;
		int prevcups = 0;
		int RL = L;
		int fullcups = 0;
		
		
		//while (howMuch)
		while (RL > rows) {
			RL-=rows;
			fullcups+=rows;
			System.out.println(fullcups);
			rows+=1;
		}
		int i = 0;
		while (i < fullcups) {
			A.add(1.0);
			i++;
			//System.out.println("done");
		}
		double extra = RL/(rows-1);
		A.add(extra/2);
		i++;
		int temp = 0;
		while (temp<rows-3) {
			A.add(extra);
			i++;
		}
		A.add(extra/2);
		
		int j = 0;
		while(j<A.size()) {
			System.out.println(A.get(j));
		}
		*/
		
		/*
		String[] A = new String[] {"a", "b", "b", "a", "c", "d", "e", "e", "d", "c"};
		int n = A.length;
		int is = 0;
		int js = 0;
		int i = 0;
		int iz = 0;
		int m = 0;
		int  mz = 1;
		int j = 0;
		boolean cont = true;
		while (i < n) {
			is = i;
			j = i;
			while (j<n) {
				cont = true;
				if (i==j) {
					cont = false;
				}
				js = j;
				while ((j-i)>=0 && cont==true) {
					String X = A[i];
					String Y = A[j];
					if (X.equals(Y)) {
						if (i==j) {
							m++;
						} else {
							m+=2;
						}
						if (m>mz) {
							mz = m;
							iz = is;
						}
					} else {
						m = 0;
						cont = false;
					}
					System.out.println(i);
					System.out.println(j);
					j--;
					i++;
					System.out.println(iz);
					System.out.println(mz);
					System.out.println();
				}
				//if (i==j) {
				//	m++;
				//	if (m>mz) {
				//		mz = m;
				//		iz = is;
				//	}
				//}
				j = js+1;
				i = is;
			}
			i = is+1;
		}
		
		System.out.println(iz);
		System.out.println(mz);
		*/
	    /*
		String player1 = "Harry";
		String player2 = "Ron";
		
		int n1 = player1.length();
		
		System.out.printf("%" );
		*/
		//printLastDigits(123458, 3);
		
		/*int x = 0;
		System.out.println("x is " + x);
		
		x = 3;
		System.out.println("x is now + x ");
		
		int y;
		y = x + 1;
		System.out.println("x and y are " + x + " and " + y);
		
		int z = 1+2;
		System.out.println(z);
	*/
		//System.out.println("CS" + 2 + 1 + "0");
		
		/*int howMany = 5;
		for (int i = 1; i<= howMany; i++ ) {
			for (int j = 1; j <= 2*i; j+=1) {
		        System.out.print(2*i-1);
		    }
		    System.out.println();
		}
		*/
		
		/*String s = "ABCDE";
		int length = s.length();
		System.out.println(length);
		System.out.println(s.charAt(length-2)-s.charAt((0)));
		System.out.println(s.substring(1,2));
		System.out.println(s.substring(2));
		System.out.printf("output is %6.3f", (double) 1/length);
		*/
		
		 /*double pi= 3.14159265359;
		 for (int i=13; i>=3; i--) {
		 	System.out.printf("%13s \n", String.valueOf(pi).substring(0,i));
		 }
		 
		 for (int i=3; i<=13; i++) {
			 System.out.printf("%13s \n", String.valueOf(pi).substring(0,i));
		 }
		 
		/*
		 double pi= 3.14159265359;
		 for (int i=11; i>=1; i--) {
			 	System.out.printf("%13." + i + "f \n", pi);
			 }
			 
			 for (int i=1; i<=11; i++) {
				 System.out.printf("%13." + i + "f \n", pi);
			 }
		 */
		
		/*
		
		 double pi= 3.14159265359;
		 for (int i=11; i>=1; i-=2) {
			 double num = Math.pow(10, i);
			 double roundpi = Math.round(pi*num)/num;
			 System.out.printf("%-13s \n", roundpi);
		 }
		 */
		
		/*int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println(n);
			if (i == n % 3) {
				n/=2;
			}
			System.out.println(n);
			System.out.println(i);
			System.out.println();
		}
		*/
		
		/*String s = "AB CD EF";
		int length = s.length();
		System.out.println(length);
		System.out.println(s.charAt(length-2));
		System.out.printf("%4s\n", s.substring(1,4));
		System.out.printf("output is %5.2f", (double) 2/length);
		*/
		
		/*int sum = 0;
		for (int i = 0; i<3; i--) {
			sum+=i;
		}
		System.out.println(sum);
		*/
		
		//int c = 25;
		//System.out.println((char) ('a' + c));
		
		// num = 20.5;
		// num1 = (long) 20.5;
		
		/*ArrayList <Integer> al = new ArrayList<>();
		HashSet <Integer> hs = new HashSet<>();
		HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i=0; i<2; i++) {
			al.add(i++);
			hs.add(i);
			hm.put(i--, al.get(i));
		}
		
		System.out.println(al);
		System.out.println(hs);
		System.out.println(hm);
		*/
		
		//System.out.println(5 + "%");
		/*
		HashSet<Integer> hs = new HashSet<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i=0; i<4; i++) {
			System.out.println(i);
			hm.put(i++, i++);
			System.out.println(hm);
			hs.add(hm.get(i-1));
			System.out.println(hs);
			hm.put(i, hm.get(i--));
			System.out.println(hm);
		}
		
		System.out.println(hm);
		System.out.println(hs);
		*/
		
		/*
		for (int i=4; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		for (int i=5; i>=1; i--) {
			System.out.println("               ||");
		}
		
		for (int i=0; i<=4; i++) {
			for (int j=12-i*3; j>=1; j--) {
				System.out.print(" ");
			}
			System.out.print("__/");
			
			for (int j=i*3; j>=1; j--) {
				System.out.print(":");
			}
			System.out.print("||");
			for (int j=i*3; j>=1; j--) {
				System.out.print(":");
			}
			System.out.println("\\__");
			
		/*
			String a = "hello";
			int x = a.length();
			System.out.println(Math.round(5.55555));
			*/
		
			//writeSequence(2);
		}
	
	/*
	public static String getString(int n) {
		
		if ((n+1)/2>1) {
			return ((n+1)/2 + " " + getString(n-2) + " " + (n+1)/2);
		}
		else if (n==1) {
			return (n + getString(n-2));
		}
		
		else if (n==2) {
			return ((n-1) + getString(n-2) + (n-1));
		}
		else {
			return "";
		}
	}
	
	public static void writeSequence(int n) {
		if (n>2) {
			System.out.print((n+1)/2 + " ");
			writeSequence(n-2);
			System.out.print((n+1)/2 + " ");
		}
		else if (n==1) {
			System.out.print(n + " ");
		}
		else if (n==2) {
			System.out.print((n-1) + " " + (n-1) + " ");
		}
	}
	*/
	/*
	public static void printLastDigits(int number, int count) {
		String sNumber = String.valueOf(number);
		int numOfDigits = String.valueOf(number).length();
		int digit = numOfDigits - count;
		for (int i = 0; i < count; i++) {
			System.out.print(sNumber.charAt(digit));
			digit++;
		}
	}
		*/
	}
}


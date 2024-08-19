package Practice1;

import java.util.*;

public class nothing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> A = new ArrayList<Character>();
		ArrayList<Character> B = new ArrayList<Character>();
		ArrayList<Character> C = new ArrayList<Character>();
		
		A.add('(');
		A.add('a');
		A.add('+');
		A.add('a');
		A.add('*');
		A.add('a');
		A.add(')');
		A.add('+');
		A.add('(');
		A.add('b');
		A.add('*');
		A.add('c');
		A.add('+');
		A.add('b');
		A.add(')');
		
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		B.add(' ');
		
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		C.add(' ');
		
		
		int N = 15;
		int k = 0;
		int j = 0;
		int i = 0;
		
		while (i < N) {
			char c = A.get(i);
			
			if ((c != '+' && c != '*') && (c != '(' && c!= ')')) {
				B.set(j,c);
				j = j+1;
			}
			if (c == '(') {
				C.set(k,c);
				k = k+1;
			}
			if (c == ')') {
				boolean cont = true;
				while (cont == true) {
					k = k-1;
					char d = C.get(k);
					if (d != '(') {
						B.set(j,d);
						j = j+1;
					}
					else {
						cont = false;
					}
				}
			}
			if (c == '+' || c == '*') {
				k = k-1;
				char d = ' ';
				if (k > -1) {
					d = C.get(k);
				}
				while (k > -1 && ((c=='+' && (d == '+' || d == '*')) || (c == '*' && d == '*'))) {
					B.set(j,d);
					j = j+1;
					k = k-1;
					d = ' ';
					if (k > -1) {
						d = C.get(k);
					}
				}
				k = k+1;
				C.set(k, c);
				k = k+1;
			}
			i = i+1;
		}
		
		k = k-1;
		while (k > -1) {
			B.set(j, C.get(k));
			j = j+1;
			k = k-1;
		}
		
		System.out.println(B);
		int M = j;
		System.out.println(M);

	}

}

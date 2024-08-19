package ch5;

import java.util.*;

public class midtermPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		System.out.println("A multiple-line comment begins with //* and ends with *//");
		System.out.println("Answer: False");
		System.out.println();
		
		//Question 2
		System.out.println("Four of Java's looping control structures are while loops, do-while loops, while-do and for loops.");
		System.out.println("Answe: False");
		System.out.println();
		
		//Question 3
		System.out.println("The following code contains which kind of error?");
		//System.out.println("What "characters" does this \\ print?");
		System.out.println("System.out.println(\"What \"characters\" does this \\\\ print?\");");
		System.out.println("Answer: Syntax Error");
		System.out.println();
		
		//Question 4
		System.out.println("The following code is syntactically correct: ");
		//int today = 14;
		//System.out,println("Today is Feb. ", today, "th");
		System.out.println("int today = 14;");
		System.out.println("System.out,println(\"Today is Feb. \", today, \"th\");");
		System.out.println("Answer: False");
		System.out.println();
		
		//Question 5
		System.out.println("Consider the following while loop. ");
		/*int k = 5;
		int i = 0;
		
		while (i <= 5) {
			System.out.println(i);
			i = i + 2;
		}
		*/
		
		System.out.println("Which one of the following for-loops is equivalent to given while-loop above?");
		//option A
		/*int i = 0;
		for (int k=5; k>=i; k-=2) {
			System.out.println(i);
		}
		*/
		
		//option B
		/*int k = 5;
		for (int i=0; i<k; i+=2) {
			System.out.println(i);
		}
		*/
		
		//option C
		/*int k = 5;
		for (int i=0; i=<k; i+=2) {
			System.out.println(i);
		}
		*/
		
		//option C
		/*int k = 5;
		for (int i=0; i=<k; i++) {
			System.out.println(i);
		}
		*/
		System.out.println("Answer: C");
		System.out.println();
		
		
		//Question 6
		System.out.println("1) What output is produced by the following loop?  2) Explain how it works. (use line number)");
		int number = 5;
		for (int count = 0; count < number; count++) {
			if (count == number % 3) {
				number/=2;
			}
			System.out.println(number);
		}
		
		System.out.println();
		
		
		//Question 7
		System.out.println("1) What output is produced by the following code?  "
				+ "2) Explain how it works. Be sure to list a constant of appropriate type "
				+ "(e.g., 7.0 rather than 7 for a double, Strings in quotes). "
				+ "If there is space(s) in the answer, mark them with a space _ (under bar). "
				+ "For example, System.out.println(“  BC”); produces  __BC . (5points/each)");
		String s = "AB CD EF";
		int length = s.length();
		System.out.println(length);
		System.out.println(s.charAt(length-2));
		System.out.printf("%4s\n", s.substring(1,4));
		System.out.printf("output is %5.2f", (double) 2/length);
		
		System.out.println();
		
		
		//Question 8
		System.out.println("The following program produces an error(s) or unexpected result(s).  "
				+ "1) Explain why and  2) how to fix it. (use line number)");
		int sum = 0;
		for (int i = 0; i<3; i--) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println();
		
		
		//Question 9
		System.out.println("Which of the following code is correct?");
		
		//option 1
		System.out.println("public static void sum(int a, int b) {");
		System.out.println("	return a+b;");
		System.out.println("}");
		
		//option 2
		System.out.println("public static int sum(a, b) {");
		System.out.println("	return a+b;");
		System.out.println("}");
		
		//option 3
		System.out.println("public static int sum(int a, int b) {");
		System.out.println("	System.out.println(a+b)");
		System.out.println("}");
				
		//option 4
		System.out.println("int a=0;");
		System.out.println("int b=1;");
		System.out.println("int result = sum(int a, int b);");
		System.out.println("System.out.println(result)");
		
		System.out.println("Answer: None of these");
		System.out.println();
		
		
		//Question 10
		System.out.println("Complete the following for loop to produce the output shown below.\n"
				+ " You must use System.out.printf statement. (Green line marks the right edge.)");
		
		//output
		//3.14159265359
		//3.141592654
		//3.1415927
		//3.14159
		//3.142
		//3.1
		
		double pi= 3.14159265359;
		for (int i=11; i>=1; i-=2) {
			 System.out.printf("%-13." + i + "f\n", pi);
		}
		
		
		/*double pi= 3.14159265359;
		for (int i=11; i>=1; i-=2) {
			 double num = Math.pow(10, i);
			 double roundpi = Math.round(pi*num)/num;
			 System.out.printf("%-13s \n", roundpi);
		 }
		 */
		
		/*double pi= 3.14159265359;
		 for (int i=13; i>=3; i--) {
		 	System.out.printf("%13s \n", String.valueOf(pi).substring(0,i));
		 }
		 
		 for (int i=3; i<=13; i++) {
			 System.out.printf("%13s \n", String.valueOf(pi).substring(0,i));
		 }
		 */
		
		System.out.println();
		
		
		//Question 11
		System.out.println("Find all the bad boolean zen(s) and "
				+ "explain how to fix it (use line number)");
		
		Scanner input = new Scanner (System.in);
		boolean made = false;
		do {
			System.out.println("input first number: ");
			int first = input.nextInt();
			System.out.println("input second number: ");
			int second = input.nextInt();
			boolean ok = checkNumbers(first, second);
			if (ok == true) {
				System.out.println("you are a genius, Bye.");
				made = true;
			}
			else {
				System.out.println("Input again");
			}
		} while (made==false);
		
		//correct code
		int first;
		int second;
		do {
			System.out.println("input first number: ");
			first = input.nextInt();
			System.out.println("input second number: ");
			second = input.nextInt();
			checkNumbers(first, second);
			if (checkNumbers(first, second)) {
				System.out.println("you are a genius, Bye.");
			}
			else {
				System.out.println("Input again");
			}
		} while (!checkNumbers(first, second));
		
		input.close();
		
		System.out.println();
		
	}

	
	//Question 12
	//Find all the bad boolean zen(s) and explain how to fix it (use line number)
	public static boolean checkNumbers(int first, int second) {
		//boolean correct = false;
		if (first<second) {
			return true;
		}
		else {
			return false;
		}
		
		//return (first<second);
	}
}

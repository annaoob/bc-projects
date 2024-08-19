package ch6;

import java.util.*;

public class midtermExamPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi= 3.14159265359;
		for (int i=1; i<=5; i++) {
			 System.out.printf("%7." + i + "f\n", pi);
		}
		
		int sumGPA = 7;
		int students = 2;
		double avgGPA = sumGPA/students;
		System.out.println(avgGPA);
		
		System.out.println((int) pi);
		//int i = 5.0;
		//double pi1 = 3.14;
		//String s = 'CS210';
		//System.out.println("i = ", i);
		//System.out.printf("%3.2d\n", pi1);
		
		int sum = 0;
		for (int i = 5; i<=1; i--) {
			sum = sum +i;
		}
		System.out.println(sum);
		
		int num = 5;
		for (int i =0; i<num; i+=2) {
			System.out.println(i);
		}
		
		int i = 0;
		while (i < num) {
			System.out.println(i);
			i+=2;
		}
		
		
		
		System.out.println("what \"character\" does this \\print?");
		
		Scanner input = new Scanner (System.in);
		System.out.println("input your name: ");
		String name = input.next();
		if (name.equals("Chloe")) {
			System.out.println("snowboarder");
		}
		
		
		
		double num1 = 3;
		for (int i1 = 0; i1 < num1; i1++) {
			if (i1 < num%2) {
				num1 = division(num1);
			}
			System.out.println(num1);
		}
		
		input.close();
	}

	public static double division (double i) {
		return (int) i/2;
	}
	
}

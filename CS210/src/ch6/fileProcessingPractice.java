package ch6;

import java.io.*;
import java.util.*;

public class fileProcessingPractice {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (new File ("student.txt"));
		for (int i = 1; i <= 6; i++) {
			int id = input.nextInt();
			String name = input.next();
			String gender = input.next();
			int age = input.nextInt();
			System.out.println(id + " " + name + " " + gender + " " + age);
		}
	}

}

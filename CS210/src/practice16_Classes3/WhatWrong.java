package practice16_Classes3;

public class WhatWrong {

	public static void main(String[] args) {
		Shape s1 = new Shape(2,3);
		//s1.width = 2;
		//s1.height = 3;
		Shape s2 = new Shape(4,5);
		//s2.width = 4;
		//s2.height = 5;
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());

	}

}

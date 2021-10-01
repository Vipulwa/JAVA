package com.assignment6.demo;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base & Height of triangle");
		double base=scanner.nextDouble();
		double height= scanner.nextDouble();
		double area=(base*height)/2;
		System.out.println("Area of Triangle :"+area);
	}

}

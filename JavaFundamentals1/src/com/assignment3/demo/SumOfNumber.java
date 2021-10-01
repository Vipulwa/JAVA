package com.assignment3.demo;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Number Between 0-1000");
		int number=scanner.nextInt();
		int sum=0;
		while(number>0) {
			int temp=number%10;
			sum+=temp;
			number/=10;
		}
		System.out.println("Sum is:"+sum);
	}

}

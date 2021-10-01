package com.assignment4.demo;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int numbers[] = new int[6];
		System.out.println("Enter 6 digit non negative number");
		int number=scanner.nextInt();
		int i=5;
		while(i>=0) {
			
			int temp=number%10;
			numbers[i]=temp;
			number/=10;
			i--;
		}
		for(int j:numbers) {
			System.out.print(j+" ");
		}
	}

}

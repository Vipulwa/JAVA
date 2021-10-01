package com.assignment4.demo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length");
		Scanner scanner = new Scanner(System.in);
		int array[]=new int[scanner.nextInt()];
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter Position");
		int position=scanner.nextInt();
		System.out.println("Enter Number");
		int number=scanner.nextInt();
		array[position]=number;
		
		for(int i:array) {
			System.out.print(i+" ");
		}
	}

}

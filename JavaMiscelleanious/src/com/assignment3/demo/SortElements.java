package com.assignment3.demo;

import java.util.Scanner;

public class SortElements {

	public static void main(String[] args) {
		int count, temp;
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter number of integers you want to enter in array");
		count= scanner.nextInt();
		int num[]=new int[count];
		System.out.println("Enter array elements");
		for (int i = 0; i < count; i++) {
			num[i]=scanner.nextInt();
		}
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j < count; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Sorted in Ascending order");
		for (int i = 0; i < count-1; i++) {
			System.out.print(num[i]+", ");
		}
		System.out.print(num[count-1]);
		scanner.close();
	}

}

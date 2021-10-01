package com.assignment5.demo;

import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String string= scanner.next();
		int middle=string.length()/2;
		if(string.length()%2==0) {
			System.out.println(string.charAt(middle-1)+""+string.charAt(middle));
		}
		else {
			System.out.println(string.charAt(middle));
		}
	}

}

package com.assignment2.demo;

public class Shape implements Printable {
	public void calculateArea() {
		System.out.println("In shape class");
	}

	@Override
	public void print() {
		System.out.println("Shape Class");
	}
}

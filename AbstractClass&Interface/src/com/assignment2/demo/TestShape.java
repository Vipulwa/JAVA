package com.assignment2.demo;

public class TestShape {
	
	public static void main(String[] args) {
		Shape shape=new Shape(); 
		shape.calculateArea();
		Shape rectangle=new Rectangle();
		rectangle.calculateArea();
		Shape circle=new Circle();
		circle.calculateArea();
		Shape triangle=new Triangle();
		triangle.calculateArea();
	}
}

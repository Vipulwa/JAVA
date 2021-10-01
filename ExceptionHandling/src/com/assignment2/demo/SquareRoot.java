package com.assignment2.demo;

public class SquareRoot {
	public void CheckForNegative(int num) throws NegativeNumberException{
		if(num<0) {
			throw new NegativeNumberException("Negative Number Root Not Possible");
		}
		else {
			System.out.println("Sqrt of "+num+" is : "+(Math.sqrt(num)));
		}
	}
	
	public static void main(String[] args) {
		SquareRoot root=new SquareRoot();
			try {
				root.CheckForNegative(-8);
			} catch (NegativeNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

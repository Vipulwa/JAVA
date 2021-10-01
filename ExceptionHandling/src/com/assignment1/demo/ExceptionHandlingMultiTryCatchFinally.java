package com.assignment1.demo;

public class ExceptionHandlingMultiTryCatchFinally {
	public static void main(String[] args) {
		try {
		      int[] myNumbers = {1, 2, 3};
		      int num1=5;
		      int num2=0;
		      int res=num1/num2;
		      System.out.println(myNumbers[10]+" "+res);
		    } catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("Something went wrong.");
		     e.printStackTrace();
		    } catch (ArithmeticException e) {
				e.printStackTrace();
			} finally {
		      System.out.println("The 'try catch' is finished.");
		    }
	}
}

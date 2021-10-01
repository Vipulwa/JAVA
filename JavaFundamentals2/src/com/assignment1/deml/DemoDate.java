package com.assignment1.deml;

import java.util.Calendar;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar cal = Calendar.getInstance();
	      //  cal.setTime(date);
		  System.out.println();
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println(cal.getTime());
			System.out.println();
	}

}

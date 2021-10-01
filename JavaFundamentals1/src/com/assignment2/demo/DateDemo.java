package com.assignment2.demo;

import java.util.Date;

public class DateDemo {
	
	private Date date;
	

	public DateDemo(Date date) {
		super();
		this.date = date;
	}
	

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	

	@Override
	public String toString() {
		return "DateDemo [date=" + date + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Date date1=new Date("1999/06/21");
		
		DateDemo object1= new DateDemo(date1);
		
		System.out.println(object1);

	}

}

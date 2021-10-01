package com.assignment3.demo;

public abstract class HDFC implements Bank,Insurance {
	@Override
	public void balance() {
		System.out.println("HDFC Acct Balacne");
	}
	
	@Override
	public void insuranceSum() {
		System.out.println("HDFC Insurance");
	}
}

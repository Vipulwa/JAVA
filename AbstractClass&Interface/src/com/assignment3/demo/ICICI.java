package com.assignment3.demo;

public abstract class ICICI implements Bank,Insurance {
	public ICICI() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void balance() {
		System.out.println("ICICI Acct Balacne");
	}
		
	@Override
	public void insuranceSum() {
		System.out.println("ICICI Insurance");
	}
}

package com.assignment3.demo;

public class Customer {
	private String name;
	private String address;
	private Long accountNum;
	private double currBalance;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accountNum=" + accountNum + ", currBalance="
				+ currBalance + "]";
	}
	public Customer(String name, String address, Long accountNum, double currBalance) {
		super();
		this.name = name;
		this.address = address;
		this.accountNum = accountNum;
		this.currBalance = currBalance;
	}
	public Customer(Long accountNum) {
		this.accountNum=accountNum;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public double getCurrBalance() {
		return currBalance;
	}
	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
		
}

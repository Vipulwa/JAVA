package com.cybage.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
public class Customer {
	@NotNull(message="Name should not be blank")
	@Id
	@GeneratedValue
	int customerId;
	@NotEmpty(message="Name should not be blank")
	@Size(min=3,max=7)
	@Column(name = "customer_name")
	String customerName;
	@NotEmpty(message="Email should not be blank")
	@Column
	String email;

	@Column	
	private String address;
	
	
	
	public Customer(int customerId, String customerName, String email,String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.address= address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [customerId=" + customerId + ", customerName=" + customerName + ", designation=" + email
				 + "]";
	}
}

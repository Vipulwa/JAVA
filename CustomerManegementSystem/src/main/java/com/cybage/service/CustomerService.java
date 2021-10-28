package com.cybage.service;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.CustomerRepository;
import com.cybage.model.Customer;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private  CustomerRepository customerRepository;
	private List<Customer> customers;

	public CustomerService() {
		customers = new ArrayList<Customer>();


	}

	public List<Customer> getAllCustomer() {
		 return customerRepository.findAll();
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated metod stub
		return customerRepository.save(customer);
		

	}

	public List<Customer> getCustomerByEmail(String email){
		return customerRepository.findByEmail(email);
	}
	
	public List<Customer> getCustomerByName(String name){
		return  customerRepository.findByCustomerName(name);
	}
	
	public List<Customer> getCustomerByAddress(String name){
		return  customerRepository.findByAddress(name);
	}
	
	
	public Customer getCustomerById(int id) {
		
		System.out.println(customerRepository.getById(id));
		Customer e= customerRepository.findByCustomerId(id);
		return e;
	}

	
	
	public Customer editCustomer(Customer e) {
		return customerRepository.save(e);
	}


	public String deleteCustomerById(int id) {
		customerRepository.deleteById(id);
	 return "Removed";
	}

}

package com.cybage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.exception.RecordNotFound;
import com.cybage.model.Customer;
import com.cybage.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = customerService.getAllCustomer();
		if(customerList.size()==0) {
			throw new RecordNotFound("Record Not Found");
		}
		else {
		return customerList;
		}
	}


	@GetMapping("/get/{name}")
	public List<Customer> getCustomersByDesignation(@PathVariable String name) {
		List<Customer> customerList = customerService.getCustomerByEmail(name);
		if(customerList.size()==0) {
			throw new RecordNotFound("Record Not Found");
		}
		else {
		return customerList;
		}
		
	}
	
	@GetMapping("/customer/{name}")
	public List<Customer> getCustomersByName(@PathVariable String name) {
		List<Customer> customerList = customerService.getCustomerByName(name);
		if(customerList.size()==0) {
			throw new RecordNotFound("Record Not Found");
		}
		else {
		return customerList;
		}
	}
	
	@GetMapping("/address/{name}")
	public List<Customer> getCustomersByAddress(@PathVariable String name) {
		List<Customer> customerList = customerService.getCustomerByAddress(name);
		if(customerList.size()==0) {
			throw new RecordNotFound("Record Not Found");
		}
		else {
		return customerList;
		}
	}
	
	@PostMapping("/add")
    ResponseEntity<Customer> createOrSaveCustomer(@RequestBody Customer customer) {
         
         return ResponseEntity.ok().body(customerService.addCustomer(customer));
    }
		
//	@GetMapping("/get/{id}")
//	ResponseEntity<?> getEmpById(@PathVariable int id){
//		return ResponseEntity.ok().body(customerService.getCustomerById(id));
//	}


	@PutMapping("/edit")
	 ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        
		System.out.println(customer.toString());
        return ResponseEntity.ok().body(customerService.editCustomer(customer));
   }

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		return ResponseEntity.ok().body(customerService.deleteCustomerById(id));

	}
	
	
	
}

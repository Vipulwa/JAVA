package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	
	@Query(value = "select * from customer where email=?",nativeQuery = true)
	List<Customer> findByEmail(String Email);
	
	@Query(value = "select * from customer where customer_name=?",nativeQuery = true)
	List<Customer> findByCustomerName(String name);
	
	@Query(value = "select * from customer where address=?",nativeQuery = true)
	List<Customer> findByAddress(String name);

	@Query(value = "select * from customer where customer_id=?",nativeQuery = true)
	Customer findByCustomerId(int id);

	
}

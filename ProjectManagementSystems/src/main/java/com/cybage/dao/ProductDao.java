package com.cybage.dao;

import java.util.List;

import com.cybage.model.Product;

public interface ProductDao {
	Product getProductById(int productId);
	void addProduct(Product product);
	List<Product> getAllProduct();
	void deleteProduct(int productId);
}

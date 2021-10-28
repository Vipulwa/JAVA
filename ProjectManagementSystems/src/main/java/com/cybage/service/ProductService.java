package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.model.Product;

public class ProductService {
	
	ProductDao productDao;
	
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}
	
	Product getProductById(int productId) {
		return productDao.getProductById(productId);
	}
	
	List<Product> getAllProduct(){
		return productDao.getAllProduct();
	}
	
	void deleteProduct(int productId) {
	}
}

package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;

public class ProductServiceImpl implements IProductService {
	
	ProductDao productDao =  new ProductDaoImpl();
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

}

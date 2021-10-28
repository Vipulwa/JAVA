package com.cybage.model;

public class Product {
	private Integer productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice	;
	}
	
}

package com.cybage.main;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.cybage.dao.ProductDao;
import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;
import com.cybage.utility.ConnectionUtility;

public class ProductManagementSystem {

	public static void main(String[] args) {
		Connection connection=ConnectionUtility.getConnection();
		try(Scanner scanner=new Scanner(System.in);){			
			ProductDao productDao=new ProductDaoImpl();			
			boolean flag=true;
			while(flag) {
				System.out.println("\n1.Add Product");
				System.out.println("2.Search Product By Product Id");
				System.out.println("3. Display All Product");
				System.out.println("4. Delete Product");
				System.out.println("5. ExiT");
				System.out.println("\nChooose Option");
				switch (scanner.nextInt()) {
				case 1:
					    Product productNew=new Product();
						System.out.println("Enter Product Id");
						int productId=scanner.nextInt();
						System.out.println("Enter Product Name");
						String productName=scanner.next();
						System.out.println("Enter Product Price");
						double productPrice=scanner.nextDouble();
						productNew.setProductId(productId);
						productNew.setProductName(productName);
						productNew.setProductPrice(productPrice);
						productDao.addProduct(productNew);
					break;

				case 2:
						System.out.println("Enter Product Id to Search Product");
						int productId1=scanner.nextInt();
						Product product1=productDao.getProductById(productId1);
						System.out.println("Product ID : "+product1.getProductId()+", Product Name : "+product1.getProductName()+", Product Price : "+product1.getProductPrice());
					break;
				
				case 3: 
						System.out.println("Product Details");
						List<Product> products=productDao.getAllProduct();
						for (Product product : products) {
							System.out.println("Product ID : "+product.getProductId()+", Product Name : "+product.getProductName()+", Product Price : "+product.getProductPrice());
						}
					break;
					
				case 4:
					System.out.println("Enter Product Id to delete");
					int productid=scanner.nextInt();
					productDao.deleteProduct(productid);
					break;
					
				case 5:
					connection.close();
					flag=false;					
					break;
					
				default:
					System.out.println("Invalid Option Selected");
					break;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

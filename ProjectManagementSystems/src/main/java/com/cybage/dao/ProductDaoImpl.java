package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;
import com.cybage.utility.ConnectionUtility;

public class ProductDaoImpl implements ProductDao {

	Connection connection = ConnectionUtility.getConnection();

	@Override
	public void addProduct(Product product) {
		try (PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?)");) {
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setDouble(3, product.getProductPrice());
			int count = preparedStatement.executeUpdate();
			System.out.println(count + " no of rows updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> productList = new ArrayList<>();
		Product product = null;
		try (Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select *from product");) {
			while (resultSet.next()) {
				product = new Product();
				product.setProductId(resultSet.getInt(1));
				product.setProductName(resultSet.getString(2));
				product.setProductPrice(resultSet.getDouble(3));
				productList.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public Product getProductById(int productId) {
		Product product = new Product();
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("select *from product where id = ?");
				) {
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				product.setProductId(resultSet.getInt(1));
				product.setProductName(resultSet.getString(2));
				product.setProductPrice(resultSet.getDouble(3));
			}
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public void deleteProduct(int productId) {
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("delete from product where id=?");) {
			preparedStatement.setInt(1, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

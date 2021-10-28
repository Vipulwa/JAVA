package com.cybage.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;
import com.cybage.util.DataBaseUtil;

public class ProductDaoImpl implements ProductDao {
	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		try (Connection connection = DataBaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from productw")) {

			while (resultSet.next()) {
				Product fetchedProduct = new Product();
				fetchedProduct.setProductId(resultSet.getInt(1));
				fetchedProduct.setProductName(resultSet.getString(2));
				fetchedProduct.setProductCost(resultSet.getInt(3));
				list.add(fetchedProduct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

package com.cybage.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cybage.model.User;
import com.cybage.util.DataBaseUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public String validateUser(User user) {
		String userName = user.getUserName();
		String password = user.getPassword();
		String retrieveUserName = null;
		String retrievePassword = null;
		String retrieveRole = null;
		try (Connection connection = DataBaseUtil.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from user")) {
			while (resultSet.next()) {
				retrieveUserName = resultSet.getString("username");
				retrievePassword = resultSet.getString("password");
				retrieveRole = resultSet.getString("role");
				if (retrieveUserName.equals(userName) && retrievePassword.equals(password)) {
					System.out.println("Valid User ");
					return retrieveRole;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "INVALID DATA";

	}
}

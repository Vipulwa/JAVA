package com.cybage.model;

public class User {
	private int userId;
	private String userName;
	private String password;
	private char roleType;

	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getRoleType() {
		return roleType;
	}

	public void setRoleType(char roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", roleType=" + roleType
				+ "]";
	}
}

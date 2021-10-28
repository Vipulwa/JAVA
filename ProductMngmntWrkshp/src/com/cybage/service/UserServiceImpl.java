package com.cybage.service;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;

public class UserServiceImpl implements IUserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public String validateUser(User user) {
		return userDao.validateUser(user);
	}

}

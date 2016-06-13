package com.javaguys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog.javaguys.user.User;
import com.javaguys.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User getUserDetails(String userId) {
		return userDao.getUserDetails(userId);
	}

	
	public String saveUserDetails(User user) {
		return userDao.saveUserDetails(user);
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}

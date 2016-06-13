package com.javaguys.dao;

import com.blog.javaguys.user.User;

public interface UserDao {
	public User getUserDetails(String userId);
	public String saveUserDetails(User user);
}

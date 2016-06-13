package com.javaguys.services;

import com.blog.javaguys.user.User;

public interface UserService {
	public User getUserDetails(String userId);
	public String saveUserDetails(User user);
}

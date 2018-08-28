package com.ccunix.icar.base.service;

import java.util.List;

import com.ccunix.icar.base.domain.User;

public interface IUserService {
	public User getUserById(int userId);

	public void insertUser(User user);

	public void addUser(User user);

	public List<User> getAllUser();
	
	public void deleteUser(User user);
}

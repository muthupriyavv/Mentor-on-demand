package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;


import com.mentorondemand.mentorondemandproject.model.User;


public interface UserService {

	public User registerUser(User user) throws SQLException;
	public List<User> findByEmail(String email);
	public List<User> getUserList();
	public User fetchuserupdate(int userId);
	public void updateuser(User user);
}

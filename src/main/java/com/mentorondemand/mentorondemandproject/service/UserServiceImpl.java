package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.dao.UserDao;
import com.mentorondemand.mentorondemandproject.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	
    @Autowired
    private UserDao userdao;
    
    
	@Override
	public User registerUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		userdao.save(user);
		return user;
	}


	@Override
	public List<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		  return userdao.findByEmail(email);
	}


	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}


	@Override
	public User fetchuserupdate(int userId) {
		// TODO Auto-generated method stub
		return userdao.getOne(userId);
	}


	@Override
	public void updateuser(User user) {
		// TODO Auto-generated method stub
		userdao.save(user);
		
	}

}

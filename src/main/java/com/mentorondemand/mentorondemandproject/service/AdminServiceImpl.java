package com.mentorondemand.mentorondemandproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.dao.AdminDao;
import com.mentorondemand.mentorondemandproject.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao admindao;

	@Override
	public Admin registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		admindao.save(admin);
		return admin;
	}

	@Override
	public List<Admin> findByEmail(String email) {
		// TODO Auto-generated method stub
		return admindao.findByEmail(email);
	}

}

package com.mentorondemand.mentorondemandproject.service;

import java.util.List;

import com.mentorondemand.mentorondemandproject.model.Admin;


public interface AdminService {
	
	public Admin registerAdmin(Admin admin);
	public List<Admin> findByEmail(String email);

}

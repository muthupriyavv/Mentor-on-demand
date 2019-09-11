package com.mentorondemand.mentorondemandproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.mentorondemandproject.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin , Integer>{

	public List<Admin> findByEmail(String email);
}

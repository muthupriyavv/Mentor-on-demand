package com.mentorondemand.mentorondemandproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.mentorondemandproject.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	   public List<User> findByEmail(String email);

}

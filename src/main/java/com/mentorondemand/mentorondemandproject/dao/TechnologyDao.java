package com.mentorondemand.mentorondemandproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.mentorondemandproject.model.Technologies;

@Repository
public interface TechnologyDao extends JpaRepository<Technologies , Integer> {

}

package com.mentorondemand.mentorondemandproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.dao.TechnologyDao;
import com.mentorondemand.mentorondemandproject.model.Technologies;
@Service
public class TechnologyServiceImpl implements TechnologyService{
	
	
	@Autowired
	private TechnologyDao technologydao;

	@Override
	public Technologies addTechnology(Technologies tech) {
		// TODO Auto-generated method stub
		
		technologydao.save(tech);
		return tech;
	}

	@Override
	public List<Technologies> getTechnology() {
		// TODO Auto-generated method stub
		return technologydao.findAll();
	}

}

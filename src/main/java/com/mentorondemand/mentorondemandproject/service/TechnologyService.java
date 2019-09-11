package com.mentorondemand.mentorondemandproject.service;



import java.util.List;

import com.mentorondemand.mentorondemandproject.model.Technologies;

public interface TechnologyService {
	
	public Technologies addTechnology(Technologies tech);
	public List<Technologies> getTechnology();

}

package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.dao.MentorSkillsDao;
import com.mentorondemand.mentorondemandproject.model.MentorSkills;

@Service
public class MentorSkillsServiceImpl implements MentorSkillsService {
	
    @Autowired
    private MentorSkillsDao mentorskillsdao;
    
	@Override
	public MentorSkills addskills(MentorSkills mentorskills) throws SQLException {
		// TODO Auto-generated method stub
		mentorskillsdao.save(mentorskills);
		return mentorskills;
	}

	@Override
	public List<MentorSkills> getMentorSkills() {
		// TODO Auto-generated method stub
		return mentorskillsdao.findAll();
	}

	@Override
	public List<MentorSkills> findBySkillname(String skill) {
		// TODO Auto-generated method stub
		
		return mentorskillsdao.findBySkillname(skill);
	}

}

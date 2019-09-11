package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.dao.MentorDao;
import com.mentorondemand.mentorondemandproject.model.Mentor;

@Service
public class MentorServiceImpl implements MentorService{

	@Autowired
	private MentorDao mentordao;
	@Override
	public Mentor registerMentor(Mentor mentor) throws SQLException {
		// TODO Auto-generated method stub
		mentordao.save(mentor);
		return mentor;
	}
	@Override
	public List<Mentor> findByEmail(String email) {
		// TODO Auto-generated method stub
		return mentordao.findByEmail(email);
	}
	@Override
	public List<Mentor> getMentorList() {
		// TODO Auto-generated method stub
		return mentordao.findAll();
	}
	@Override
	public List<Mentor> findByTimeSlot(String timeslot) {
		// TODO Auto-generated method stub
		return mentordao.findByTimeslot(timeslot);
	}

}

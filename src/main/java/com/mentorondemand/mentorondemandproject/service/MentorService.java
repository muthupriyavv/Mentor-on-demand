package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;

import com.mentorondemand.mentorondemandproject.model.Mentor;

public interface MentorService {
	
	public Mentor registerMentor(Mentor mentor) throws SQLException;
	public List<Mentor> findByEmail(String email);
	public List<Mentor> getMentorList();
	public List<Mentor> findByTimeSlot(String timeslot);

}

package com.mentorondemand.mentorondemandproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.mentorondemandproject.model.Mentor;

@Repository
public interface MentorDao extends JpaRepository<Mentor , Integer> {
	
	public List<Mentor> findByEmail(String email);
	public List<Mentor> findByTimeslot(String timeslot);

}

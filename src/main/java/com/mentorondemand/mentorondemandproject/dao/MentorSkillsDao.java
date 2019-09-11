package com.mentorondemand.mentorondemandproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mentorondemand.mentorondemandproject.model.MentorSkills;

@Repository
public interface MentorSkillsDao  extends  JpaRepository<MentorSkills,Integer>{
	
	@Query(value = "SELECT mentorskills FROM MentorSkills mentorskills WHERE mentorskills.skillname=?1")
	public  List<MentorSkills> findBySkillname(String skill);

}

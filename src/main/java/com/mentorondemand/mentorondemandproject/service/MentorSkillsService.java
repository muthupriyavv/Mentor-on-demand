package com.mentorondemand.mentorondemandproject.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mentorondemand.mentorondemandproject.model.Mentor;
import com.mentorondemand.mentorondemandproject.model.MentorSkills;


public interface MentorSkillsService {
    public MentorSkills addskills(MentorSkills mentorskills)  throws SQLException;
    public List<MentorSkills> getMentorSkills();
    public List<MentorSkills> findBySkillname(String skill);
}

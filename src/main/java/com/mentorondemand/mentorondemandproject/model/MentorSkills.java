package com.mentorondemand.mentorondemandproject.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	//@JsonProperty("mentor")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mentorid")
	Mentor mentor;

	@Column(name = "skillname")
	private String skillname;

	@Column(name = "start_date")
	private Date start_date;

	@Column(name = "end_date")
	private Date end_date;
	
	@Column(name="facility")
	private String facility;

	@Column(name = "fee")
	private int fee;

	@Column(name = "rating")
	private int rating;

	public MentorSkills() {

	}

	public MentorSkills(Mentor mentor, String skillname, Date start_date, Date end_date,String facility, int fee, int rating) {
		this.mentor = mentor;
		this.skillname = skillname;
		this.start_date = start_date;
		this.facility=facility;
		this.end_date = end_date;
		this.fee = fee;
		this.rating = 5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mentor=" + mentor + ", skillname=" + skillname + ", start_date="
				+ start_date + ", end_date=" + end_date + ", facility=" + facility + ", fee=" + fee + ", rating="
				+ rating + "]";
	}


}

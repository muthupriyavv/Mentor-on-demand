package com.mentorondemand.mentorondemandproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userid")
	User user;

	@Column(name = "user_name")
	private String user_name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mentorid")
	Mentor mentor;

	@Column(name = "mentor_name")
	private String mentor_name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mentorskill_id")
	MentorSkills mentorSkills;

	@Column(name = "technology")
	private String technology;

	@Column(name = "fee")
	private int fee;

	@Column(name = "progress")
	private int progress;

	public Payments() {

	}

	public Payments(User user, String user_name, Mentor mentor, String mentor_name, MentorSkills mentorSkills,
			String technology, int fee) {
		this.user = user;
		this.user_name = user_name;
		this.mentor = mentor;
		this.mentor_name = mentor_name;
		this.mentorSkills = mentorSkills;
		this.technology = technology;
		this.fee = fee;
		this.progress = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public String getMentor_name() {
		return mentor_name;
	}

	public void setMentor_name(String mentor_name) {
		this.mentor_name = mentor_name;
	}

	public MentorSkills getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(MentorSkills mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", user=" + user + ", user_name=" + user_name + ", mentor=" + mentor
				+ ", mentor_name=" + mentor_name + ", mentorSkills=" + mentorSkills + ", technology=" + technology
				+ ", fee=" + fee + ", progress=" + progress + "]";
	}

}

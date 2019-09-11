package com.mentorondemand.mentorondemandproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "phone_number")
	private long phone_number;

	@Column(name = "timeslot")
	private String timeslot;

	@Column(name = "linkedin_url")
	private String linkedin_url;

	@Column(name = "mentor_profile")
	private String mentor_profile;

	@Column(name = "experience")
	private int experience;

	@Column(name = "access")
	private int access;

	public Mentor() {

	}

	public Mentor(String name, String email, String password, long phone_number, String timeslot,
			String linkedin_url, String mentor_profile, int experience) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
		this.timeslot = timeslot;
		this.linkedin_url = linkedin_url;
		this.mentor_profile = mentor_profile;
		this.experience = experience;
		this.access = 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}


	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getMentor_profile() {
		return mentor_profile;
	}

	public void setMentor_profile(String mentor_profile) {
		this.mentor_profile = mentor_profile;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getAccess() {
		return access;
	}

	public void setAccess(int access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone_number="
				+ phone_number + ", timeslot=" + timeslot + ", linkedin_url=" + linkedin_url + ", mentor_profile="
				+ mentor_profile + ", experience=" + experience + ", access=" + access + "]";
	}

 

}

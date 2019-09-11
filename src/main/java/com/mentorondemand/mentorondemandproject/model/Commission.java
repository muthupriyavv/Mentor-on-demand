package com.mentorondemand.mentorondemandproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commssion")
public class Commission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "percentage")
	private int percentage;

	public Commission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commission(int percentage) {
		super();
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Commission [id=" + id + ", percentage=" + percentage + "]";
	}

}

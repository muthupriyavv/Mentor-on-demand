package com.mentorondemand.mentorondemandproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technology")
public class Technologies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "toc")
	private String toc;

	@Column(name = "prerequisites")
	private String prerequisites;

	public Technologies() {

	}

	public Technologies(String name, String toc, String prerequisites) {
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
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

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	@Override
	public String toString() {
		return "Technologies [id=" + id + ", name=" + name + ", toc=" + toc + ", prerequisites=" + prerequisites + "]";
	}

}

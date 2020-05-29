package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course", schema = "musicnet")
public class Course {
	
	public Integer id;
	public String description;
	public String instrumentname;
	public String difficulty;
	public Integer hours;
	public Boolean studentcontact;
	public Boolean teachercontact;
	public String lenguage;
	public String emailaddressteacher;
	public String stylename;

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(Integer id, String description, String instrumentname, String difficulty, Integer hours,
			Boolean studentcontact, Boolean teachercontact, String lenguage, String emailaddressteacher,
			String stylename) {
		this.id = id;
		this.description = description;
		this.instrumentname = instrumentname;
		this.difficulty = difficulty;
		this.hours = hours;
		this.studentcontact = studentcontact;
		this.teachercontact = teachercontact;
		this.lenguage = lenguage;
		this.emailaddressteacher = emailaddressteacher;
		this.stylename = stylename;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "instrumentname", nullable = false)
	public String getInstrumentname() {
		return instrumentname;
	}

	public void setInstrumentname(String instrumentname) {
		this.instrumentname = instrumentname;
	}

	@Column(name = "difficulty", nullable = false)
	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	@Column(name = "hours", nullable = false)
	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	@Column(name = "studentcontact", nullable = false)
	public Boolean getStudentcontact() {
		return studentcontact;
	}

	public void setStudentcontact(Boolean studentcontact) {
		this.studentcontact = studentcontact;
	}

	@Column(name = "teachercontact", nullable = false)
	public Boolean getTeachercontact() {
		return teachercontact;
	}

	public void setTeachercontact(Boolean teachercontact) {
		this.teachercontact = teachercontact;
	}

	@Column(name = "lenguage", nullable = false)
	public String getLenguage() {
		return lenguage;
	}

	public void setLenguage(String lenguage) {
		this.lenguage = lenguage;
	}

	@Column(name = "emailaddressteacher", nullable = false)
	public String getEmailaddressteacher() {
		return emailaddressteacher;
	}

	public void setEmailaddressteacher(String emailaddressteacher) {
		this.emailaddressteacher = emailaddressteacher;
	}

	@Column(name = "stylename", nullable = false)
	public String getStylename() {
		return stylename;
	}

	public void setStylename(String stylename) {
		this.stylename = stylename;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + ", instrumentname=" + instrumentname
				+ ", difficulty=" + difficulty + ", hours=" + hours + ", studentctontact=" + studentcontact
				+ ", teacherctontact=" + teachercontact + ", lenguage=" + lenguage + ", emailaddressteacher="
				+ emailaddressteacher + ", stylename=" + stylename + "]";
	}




}

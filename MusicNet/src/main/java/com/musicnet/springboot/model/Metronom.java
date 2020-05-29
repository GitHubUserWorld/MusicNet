package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "metronom", schema = "musicnet")
public class Metronom {
	
	private String name;
	private String description;
	private String file;
	private int velocity;
	
	public Metronom() {
		// TODO Auto-generated constructor stub
	}

	public Metronom(String name, String description, String file, int velocity) {
		this.name = name;
		this.description = description;
		this.file = file;
		this.velocity = velocity;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "file", nullable = false)
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Id
	@Column(name = "velocity", nullable = false)
	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}


	
}

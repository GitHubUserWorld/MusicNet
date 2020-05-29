package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "instrument", schema = "musicnet")
public class Instrument {
	
	private String name;
	private String description;

	public Instrument() {

	}

	public Instrument(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Id
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

	@Override
	public String toString() {
		return "SystemAdministrator [name=" + name + ", description=" + description + "]";
	}
	
}

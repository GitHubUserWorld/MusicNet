package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "style", schema = "musicnet")
public class Style {
	
	private String name;
	private String description;

	public Style() {

	}

	public Style(String name, String description) {
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

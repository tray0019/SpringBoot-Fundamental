/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
 * POJO - Plain Old Java Object
 * This is my [Data Model] class representing Topics for
 * language and framework 
 */
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
	
	/*
	 *Constructor
	 */
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

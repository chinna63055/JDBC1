package com.lokesh.visitorDataManagement.dto;

import java.sql.Date;

public class Visitor {
	
	private Integer id;
	private String name;
	private String email;
	private Date visited_Date;
	private Integer phone;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Date getVisitedDate() {
		return visited_Date;
	}
	public void setVisitedDate(Date visitedDate) {
		this.visited_Date = visitedDate;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	
	
	


}

package com.lokesh.visitorDataManagement.service;

import java.sql.Date;
import java.util.List;

import com.lokesh.visitorDataManagement.dto.Visitor;

public interface VisitorService {

	public String saveVisitor(Visitor visitor);
	
	public String updateVisitor(Visitor visitor);
	
	public Visitor getVisitorById(int id);
	
	public Visitor getVisitorByPhone(String phone);
	
	public Visitor getVisitorByEmail(String email);
	
	public List<Visitor> getallVisitors();
	
	public List<Visitor> getVisitorsByVisitingDate(Date date);
	
	public Visitor deletevisitorById(int id);
}

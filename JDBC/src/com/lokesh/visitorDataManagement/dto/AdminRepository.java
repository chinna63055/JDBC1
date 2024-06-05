package com.lokesh.visitorDataManagement.dto;

public interface AdminRepository {
	
	public String saveAdmin(Admin admin);
	
	public Admin adminLogin(String username,String password);
}

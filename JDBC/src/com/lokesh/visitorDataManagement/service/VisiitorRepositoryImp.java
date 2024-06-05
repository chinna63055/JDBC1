package com.lokesh.visitorDataManagement.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.lokesh.visitorDataManagement.dto.Visitor;
import com.lokesh.visitorDataManagement.util.AppConstants;
import com.lokesh.visitorDataManagement.util.ConnectionUtil;

public class VisiitorRepositoryImp implements VisitorService {


	@Override
	public String saveVisitor(Visitor visitor) {
		Connection  connection = ConnectionUtil.getConnection();
		String sql="INSERT INTO visitor(name,email,visited_date,phone)VALUES(?,?,?,?)";
		try {
			PreparedStatement ps= connection.prepareStatement(sql);
			ps.setString(1, visitor.getName());
			ps.setString(2, visitor.getEmail());
			ps.setDate(3, visitor.getVisitedDate());
			ps.setString(4, visitor.getName());
			
			ps.executeUpdate();
			
			connection.close();
			return AppConstants.SUCCESS_MESSAGE;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return AppConstants.ERROR_MESSAGE;
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		return null;
	}
	@Override
	public Visitor getVisitorById(int id) {
		return null;
	}

	@Override
	public Visitor getVisitorByPhone(String phone) {
		return null;
	}

	@Override
	public Visitor getVisitorByEmail(String email) {
		return null;
	}

	@Override
	public List<Visitor> getallVisitors() {
		Connection  connection = ConnectionUtil.getConnection();
		String sql ="SELECT * FROM visitor";
		List<Visitor> list=null;
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.isBeforeFirst()) {
				list = new ArrayList<>();
				while(rs.next()) {
					Visitor vs = new Visitor();
					vs.setId(rs.getInt("id"));
					vs.setName(rs.getString("name"));
					vs.setEmail(rs.getString("email"));
					vs.setVisitedDate(rs.getDate("visited_date"));
					vs.setPhone(rs.getInt("phone"));
					list.add(vs);
				}
			}
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Visitor> getVisitorsByVisitingDate(Date date) {
		return null;
	}

	@Override
	public Visitor deletevisitorById(int id) {
		return null;
	}

}

package com.Abhijith.TestBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestMultiInsert {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/e4";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, user, password);
			
			Statement statement=connection.createStatement();
			
			String sql = "INSERT INTO person VALUES (?,?, ?, ?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1,90);
			ps.setString(2, "Ambu");
			ps.setInt(3, 28);
			ps.setString(4, "am23@gmaill.com");
			ps.setInt(5, 9876543);
			ps.addBatch();

//			ps.setInt(1,82);
//			ps.setString(2, "Monika");
//			ps.setInt(3, 25);
//			ps.setString(4, "moni23@gmaill.com");
//			ps.setInt(5, 9876543);
//			ps.addBatch();
//
//			ps.setInt(1,83);
//			ps.setString(2, "Ganesh");
//			ps.setInt(3, 28);
//			ps.setString(4, "Gane23@gmaill.com");
//			ps.setInt(5, 9876543);
//			ps.addBatch();
//
//			ps.setInt(1,86);
//			ps.setString(2, "Hari");
//			ps.setInt(3, 28);
//			ps.setString(4, "har23@gmaill.com");
//			ps.setInt(5, 9876543);
//			ps.addBatch();
			
			int[] batch=ps.executeBatch();
			
			for(Integer n:batch)System.out.println(n);
			
			connection.close();
			} catch (Exception e)
			{
				e.printStackTrace(); 
			}
		
	}

}

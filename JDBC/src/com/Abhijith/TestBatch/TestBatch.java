package com.Abhijith.TestBatch;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class TestBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/e4";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, user, password);
			
			Statement statement=connection.createStatement();
			
			String sql = "INSERT INTO person VALUES (405,'Niharika', 30, 'hari511@gmail.com',456765)";
			String update = "UPDATE person SET  name='Kormandu' WHERE name='Niharika'";
			
			statement.addBatch(sql);
			statement.addBatch(update);
			int[] batch = statement.executeBatch();
			
			for(int n: batch)System.out.println(n);
					
			connection.close();
			} catch (Exception e)
			{
				e.printStackTrace(); 
			}
	}
			
}

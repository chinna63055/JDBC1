package jdbc.intro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
/*
 * This is the alter way  of inserting the data in the sql 
 *  database
 */

public class TestInsert {
	private static Object connection;

	public static void main(String[] args) {
		try
		{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/e4?user=root&password=root";
		String user="root";
		String password="root";
		Connection connection = DriverManager.getConnection(url);
		System.out.println("Connected");
		String sql="INSERT INTO person VALUES (?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, 205);
		ps.setString(2, "Nandha");
		ps.setInt(3,23);
		ps.setString(4, "nandha3@gmail.com");
		ps.setInt(5,87654);
		
		int res = ps.executeUpdate();
		System.out.println(res);
		connection.close();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}
}

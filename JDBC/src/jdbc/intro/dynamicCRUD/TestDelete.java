package jdbc.intro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestDelete {

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
		String sql="DELETE FROM person WHERE name=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "harika");
	
		
		int res = ps.executeUpdate();
		System.out.println(res+"row of data deleted");
		connection.close();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}
}

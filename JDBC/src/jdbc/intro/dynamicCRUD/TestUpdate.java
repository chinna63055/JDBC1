package jdbc.intro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestUpdate {
	
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
		String sql="UPDATE person SET name=?, age=?, email=? WHERE id=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, "Pooja");
		ps.setInt(2,24);
		ps.setString(3, "pooja@gmail.com");
		ps.setInt(4,204);
		
		int res = ps.executeUpdate();
		System.out.println(res+"row of data updated");
		connection.close();
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	
	}

}

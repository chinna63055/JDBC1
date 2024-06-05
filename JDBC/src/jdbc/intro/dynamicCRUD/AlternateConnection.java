package jdbc.intro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class AlternateConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/e4";

			Properties properties =new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "root");
			
			Connection connection = DriverManager.getConnection(url,properties);
			System.out.println("connection");
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM person");
			ResultSet rs = ps.executeQuery();
			boolean next = rs.isBeforeFirst();
			java.sql.ResultSetMetaData metadata = rs.getMetaData();
			int count = metadata.getColumnCount();
			System.out.println(next);
			while(rs.next()) {
				for(int i=1;i<=count;i++)
					System.out.println(metadata.getColumnName(i)+" = "+rs.getObject(i));
				System.out.println();
				
			}
			rs.close();
			ps.close();
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

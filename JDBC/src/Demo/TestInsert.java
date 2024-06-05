package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1 importing the package
 * 2.load & register driver
 * 3.establish the Connection
 * 4.create statement
 * 5.execute the statement
 * 6.
 * 7.close the connection
 */

public class TestInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/ e4";
			String userName="root";
			String pass="root";
			Connection connection=DriverManager
					.getConnection(url,userName,pass);
			Statement statement= connection.createStatement();
			
			String sql="INSERT INTO person VALUES"
					+"(104,'harika',30,'hari54@gmail.com',345539)";
			
			String sql1="UPDATE person SET age=100 WHERE id=103";
			
			String sql2="DELETE TABLE person where id=104";
			
			String sql3="SELECT * from person";
			boolean res = statement.execute(sql3);
			
			ResultSet rs=statement.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getObject(3));
				System.out.println(rs.getObject(4));
				System.out.println(rs.getObject(5));
				System.out.println("-----------------------");
			}
			System.out.println(rs);
		
			connection.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

package jdbc.intro.dynamicCRUD;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class readTableProperty {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/e4";
		FileInputStream  f = new FileInputStream("mydbinfo.properties");
		Properties properties = new Properties();
		properties.load(f);
		DriverManager.getConnection(url, properties);
		System.out.println("Connection");
		} catch (Exception e)
		{
			e.printStackTrace(); 
		}
	}
}

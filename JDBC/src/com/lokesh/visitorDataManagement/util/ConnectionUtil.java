package com.lokesh.visitorDataManagement.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection() {
		try {
			Class.forName(AppConstants.DRIVER_NAME);
			
			return DriverManager.getConnection( AppConstants.URL ,AppConstants
					.USER_NAME, AppConstants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

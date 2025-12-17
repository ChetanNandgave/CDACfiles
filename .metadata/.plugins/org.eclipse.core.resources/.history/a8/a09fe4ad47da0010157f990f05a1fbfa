package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program01 {
	private static final String URL="jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME="root";
	private static final String PASSWORD="manager";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//socket connection between database and java
		try {
			Connection connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			if(connection!=null) {
				System.out.println("Connection Succes");
				connection.close();
			}
			else {
				System.out.println("Connection Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

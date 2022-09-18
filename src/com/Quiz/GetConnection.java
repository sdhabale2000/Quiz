package com.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GetConnection {
	Connection connection=null;
	PreparedStatement ps=null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			
		} catch (Exception e) {
		   e.printStackTrace();
		}
		
		return connection;
		
	}

}

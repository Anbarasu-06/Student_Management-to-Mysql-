package com.java.Connecting;

import java.sql.Connection;
import java.sql.*;

public class Connecting {
	
	private final static String URL = "jdbc:mysql://localhost:3306/student_management";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Anbarasu@26";
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private Connection con;
	
	 public Connection loadDriver() {
	        try {
	            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return con;
	    }

	    // Close the connection
	    public void closeConnection() {
	        try {
	            if (con != null && !con.isClosed()) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	



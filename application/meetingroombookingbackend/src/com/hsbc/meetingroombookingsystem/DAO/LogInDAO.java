package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Meeting;

public class LogInDAO {
	
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "Root";
	    private static final String GET_ALL_MEETINGS_QUERY = "SELECT * FROM login";
	    
	    public static String LogIn(String username,String password) throws SQLException{
			Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_MEETINGS_QUERY);
	       ResultSet resultSet = preparedStatement.executeQuery();
	       while (resultSet.next()) {
	    	   if(resultSet.getString("user_name").equals(username)&&resultSet.getString("password").equals(password)){
	    		   return resultSet.getString("Role");
	    	   }
	       }
	       return null;
		}

}

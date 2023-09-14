package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.SQLException;

public class RoleDAO {
    List<Role> roles = new Role();
     private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "Root";
	    private static final String GET_ALL_MEETINGS_QUERY = "SELECT * FROM roles";
	    
	    public RoleDAO() throws SQLException{
			Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_MEETINGS_QUERY);
	       ResultSet resultSet = preparedStatement.executeQuery();
	       while (resultSet.next()) {
	           Role meeting = new Role();
	           meeting.setName(resultSet.getString("name"));
               roles.add(meeting);
           }
        }
    }



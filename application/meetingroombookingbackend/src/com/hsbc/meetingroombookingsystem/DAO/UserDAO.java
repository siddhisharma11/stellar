package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Admin;
import com.hsbc.meetingroombookingsystem.domain.Manager;
import com.hsbc.meetingroombookingsystem.domain.Members;
import com.hsbc.meetingroombookingsystem.domain.Role;
import com.hsbc.meetingroombookingsystem.domain.User;

public class UserDAO {
	
	private static List<User> admins = new ArrayList();
	private static List<User> managers = new ArrayList();
	private static List<User> members = new ArrayList();
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "Root";
	    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM users";
	
	public UserDAO()  {
		try{Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS_QUERY);
       ResultSet resultSet = preparedStatement.executeQuery();
       while (resultSet.next()) {
           if(resultSet.getString("role").equals("Manager")) {
        	   User mananger = new Manager(0,"","","",0,null);
        	   mananger.setUniqueID(resultSet.getInt("id"));
        	   mananger.setName(resultSet.getString("name"));
        	   mananger.setEmail(resultSet.getString("email"));
        	   mananger.setPhone(resultSet.getString("phone"));
        	   mananger.setCredits(resultSet.getInt("credits"));
        	   mananger.setRole(new Role(resultSet.getString("role")));
        	   managers.add(mananger);
        	   
           }else if(resultSet.getString("role").equals("Admin")) {
        	   User admin = new Admin(0,"","","");
        	   admin.setUniqueID(resultSet.getInt("id"));
        	   admin.setName(resultSet.getString("name"));
        	   admin.setEmail(resultSet.getString("email"));
        	   admin.setPhone(resultSet.getString("phone"));
        	   admins.add(admin);
        	   
           }else if(resultSet.getString("role").equals("Member")) {
        	   User member = new Members(0,"","","",null);
        	   member.setUniqueID(resultSet.getInt("id"));
        	   member.setName(resultSet.getString("name"));
        	   member.setEmail(resultSet.getString("email"));
        	   member.setPhone(resultSet.getString("phone"));
        	   member.setRole(new Role(resultSet.getString("role")));
        	   members.add(member);
           }
     
       }}catch(Exception e) {}
	}
	
	public void addnewManager(User newManager) {
		if(useralreadythere(newManager.getUniqueID()))
		try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id,name,email,phone,credits,role) VALUES (?, ?, ?, ?, ?,?)")) {
			preparedStatement.setInt(1, newManager.getUniqueID());    
			preparedStatement.setString(2, newManager.getName());
	            preparedStatement.setString(3, newManager.getEmail());
	            preparedStatement.setString(4, newManager.getPhone());
	            preparedStatement.setInt(5, newManager.getCredits());
	            preparedStatement.setString(6, (newManager.getRole().getName()));
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}
	
	private boolean useralreadythere(int uniqueID) {
		if(getUserByUserId(uniqueID)!=null) {
			return true;
		}
		return false;
	}

	public void addnewAdmin(User newAdmin) {
		if(useralreadythere(newAdmin.getUniqueID()))
			try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id,name,email,phone) VALUES (?, ?, ?, ?)")) {
				preparedStatement.setInt(1, newAdmin.getUniqueID());    
				preparedStatement.setString(2, newAdmin.getName());
		            preparedStatement.setString(3, newAdmin.getEmail());
		            preparedStatement.setString(4, newAdmin.getPhone());
		         
		            preparedStatement.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
	}
	
	public void addnewMember(User newMember) {
		if(useralreadythere(newMember.getUniqueID()))
			try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id,name,email,phone) VALUES (?, ?, ?, ?)")) {
				preparedStatement.setInt(1, newMember.getUniqueID());    
				preparedStatement.setString(2, newMember.getName());
		            preparedStatement.setString(3, newMember.getEmail());
		            preparedStatement.setString(4, newMember.getPhone());
		         
		            preparedStatement.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
	}
	
	public static void creditupdate() {
		UserDAO togetlist = new UserDAO();
		for(User manager:managers) {
			manager.setCredits(manager.getCredits()+20);
		
		try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET(credits) VALUES (?) WHERE id=?")) {
			preparedStatement.setInt(1,manager.getCredits());
			preparedStatement.setInt(2, manager.getUniqueID());
			preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }}
		}
	
	
	
	public static User getUserByUserId(int id) {
		for(User a:admins) {
			if(a.getUniqueID()==id) {
				return a;
			}
		}
		for(User ma:managers) {
			if(ma.getUniqueID()==id) {
				return ma;
			}
		}
		for(User me:managers) {
			if(me.getUniqueID()==id) {
				return me;
			}
		}
           return null;
	}
	
	

}

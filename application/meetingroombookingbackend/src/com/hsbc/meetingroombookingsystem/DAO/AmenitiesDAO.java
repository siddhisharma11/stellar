package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Amenities;
import com.hsbc.meetingroombookingsystem.exceptions.AmenitiesAlreadyExistsException;

public class AmenitiesDAO {
	
	private static List<Amenities> amenities = new ArrayList();
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Root";
    private static final String GET_ALL_MEETINGS_QUERY = "SELECT * FROM amenities";
    
	public AmenitiesDAO()  {
		try{Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_MEETINGS_QUERY);
       ResultSet resultSet = preparedStatement.executeQuery();
       while(resultSet.next()) {
    	   Amenities am = new Amenities("");
    	   am.setName(resultSet.getString("amenity_name"));
    	   amenities.add(am);
       }}catch(Exception e) {}
	}
    
	public void addamenity(Amenities newAmenity) throws AmenitiesAlreadyExistsException {
		if(checkexistance(newAmenity)) {
			try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO amenities (amenity_name) VALUES (?)")) {
			  
				preparedStatement.setString(1,newAmenity.getName());
		}catch (SQLException e) {
            e.printStackTrace();
        }}
	}
	
	public boolean checkexistance(Amenities newAmenity) throws AmenitiesAlreadyExistsException {
		for(Amenities a:amenities) {
			if(a.getName().equals(newAmenity.getName())) {
		throw new AmenitiesAlreadyExistsException("Amenity already exists !!!");
	}
		}return true;}
	
	public static Amenities getbyName(String name) {
		for(Amenities a:amenities) {
			if(a.getName().equals(name))
				return a;
		}
		
		return null;
	}
	
	public static List<Amenities> getAll() {
		return amenities;
		
	}

}

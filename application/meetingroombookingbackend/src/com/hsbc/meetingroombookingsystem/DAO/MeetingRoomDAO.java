package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Amenities;
import com.hsbc.meetingroombookingsystem.domain.Meeting;
import com.hsbc.meetingroombookingsystem.domain.MeetingRoom;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingRoomAlreadyExistsException;

public class MeetingRoomDAO {
	
	private static List<MeetingRoom> meetingrooms = new ArrayList();
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "Root";
	    private static final String GET_ALL_MEETINGS_QUERY = "SELECT * FROM meetingrooms";
	    
	    public MeetingRoomDAO()  {
	    	try{Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_MEETINGS_QUERY);
	       ResultSet resultSet = preparedStatement.executeQuery();
	       while (resultSet.next()) {
	           MeetingRoom meetingroom = new MeetingRoom();
	           meetingroom.setUniqueName(resultSet.getString("uniquename"));
	           meetingroom.setSeatingCapacity(resultSet.getInt("seating_capacity"));
	           meetingroom.setRating(resultSet.getInt("rating"));
	           meetingroom.setCost(resultSet.getInt("cost"));
	           meetingroom.setAmenitiesAvailable(decodeamenities(resultSet.getArray("amenities")));
	           meetingrooms.add(meetingroom);
	       }}catch(Exception e) {
	    	   
	       }
	    }

	private List<Amenities> decodeamenities(Array array) throws SQLException {
			List<Amenities> amenities = new ArrayList();
			String[] elements = (String[]) array.getArray();
			for(String am : elements) {
				amenities.add(AmenitiesDAO.getbyName(am));
			}
			return amenities;
		}

	public void newmeetingroom(MeetingRoom newmeetingroom)throws MeetingRoomAlreadyExistsException {
	
			if(checkAlreadyExist(newmeetingroom)) {
				try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO meetingrooms (unique_name,capacity,rating,amenities,cost) VALUES (?, ?, ?, ?, ?)")) {
				  
					preparedStatement.setString(1,newmeetingroom.getUniqueName());
					preparedStatement.setInt(2, newmeetingroom.getSeatingCapacity());
					preparedStatement.setInt(3, newmeetingroom.getRating());
					preparedStatement.setArray(4, (Array) newmeetingroom.getAmenitiesAvailable());
					preparedStatement.setInt(5, newmeetingroom.getCost());
			        preparedStatement.executeUpdate();
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			}
		
	}

	private boolean checkAlreadyExist(MeetingRoom newmeetingroom) throws MeetingRoomAlreadyExistsException {
		for(MeetingRoom am:meetingrooms) {
			if(am.getUniqueName().equals(newmeetingroom.getUniqueName()))
		throw new MeetingRoomAlreadyExistsException("MeetingRoom Already Exists !!");
		}
		return true;
	}
	
	public List<MeetingRoom> getall(){
		return meetingrooms;
	}
	
}

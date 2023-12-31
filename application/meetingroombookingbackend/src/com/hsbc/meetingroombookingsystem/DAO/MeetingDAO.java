package com.hsbc.meetingroombookingsystem.DAO;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Meeting;
import com.hsbc.meetingroombookingsystem.domain.User;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingAlreadyExistsException;

public class MeetingDAO {
	
	private static List<Meeting> meetings = new ArrayList();
	
	 private static final String JDBC_URL = "jdbc:mysql://localhost:8080/StellarDatabase";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "Root";
	    private static final String GET_ALL_MEETINGS_QUERY = "SELECT * FROM meetings";
	    
	    public MeetingDAO() throws SQLException{
			Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_MEETINGS_QUERY);
	       ResultSet resultSet = preparedStatement.executeQuery();
	       while (resultSet.next()) {
	           Meeting meeting = new Meeting();
	           meeting.setUniqueID(resultSet.getInt("id"));
	           meeting.setTitle(resultSet.getString("title"));
	           meeting.setMeetingDate((resultSet.getDate("meeting_date")).toLocalDate());
	           meeting.setStartTime((resultSet.getTime("start_time")).toLocalTime());
	           meeting.setEndTime((resultSet.getTime("end_time")).toLocalTime());
	           meeting.setUser(UserDAO.getUserByUserId(resultSet.getInt("user_id")));
	           meeting.setTypeOfMeeting(meeting.getTypeOfMeeting());
	           meeting.setAttendies(decodeUsers(resultSet));
	           meetings.add(meeting);
	       }
		}
	
	public void newmeeting(Meeting newmeeting) throws MeetingAlreadyExistsException{
		if(meetingalreadythere(newmeeting.getUniqueID())) {
			try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO meetings (unique_Id,title,organizer_id, meeting_date, start_time, end_time, meetingtype, attendies) VALUES (?, ?, ?, ?, ?,?, ?, ?)")) {
				preparedStatement.setInt(1, newmeeting.getUniqueID());    
				preparedStatement.setString(2, newmeeting.getTitle());
		            preparedStatement.setDate(3, java.sql.Date.valueOf(newmeeting.getMeetingDate()));
		            preparedStatement.setTime(4, java.sql.Time.valueOf(newmeeting.getStartTime()));
		            preparedStatement.setTime(5, java.sql.Time.valueOf(newmeeting.getStartTime()));
		            preparedStatement.setLong(6, (newmeeting.getTypeOfMeeting()).getUniqueID());
		            preparedStatement.setArray(7, (Array) newmeeting.getAttendies());

		            preparedStatement.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
			
		}
		
		
	}

	private boolean meetingalreadythere(int id) throws MeetingAlreadyExistsException{
		for(Meeting meet:meetings) {
			if(meet.getUniqueID()==id)
				throw new MeetingAlreadyExistsException("Meeting Already Exists");
		}
		return true;
				
	}

	public static List<Meeting> getAll() {
		return meetings;
	}
	
	public static List<Meeting> getmeetingbyid(int id){
		List<Meeting> foruser = new ArrayList();
		for(Meeting m:meetings) {
			List<User> attendies = new ArrayList();
			attendies = m.getAttendies();
			for(User k:attendies) {
				if(k.getUniqueID()==id) {
					foruser.add(m);
				}
			}
		}
		return foruser;
	}
	
	public static List<User> decodeUsers(ResultSet resultset) throws SQLException{
		List<User> attendies =new ArrayList();
		Array array = resultset.getArray("userId");
		Integer[] intArray = (Integer[]) array.getArray(); 
		for (Integer element : intArray) {
            attendies.add(UserDAO.getUserByUserId(element));
        }
		return attendies;
	}
	}
	




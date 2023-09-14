package com.hsbc.meetingroombookingsystem.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.hsbc.meetingroombookingsystem.domain.Meeting;
import com.hsbc.meetingroombookingsystem.domain.MeetingRoom;
import com.hsbc.meetingroombookingsystem.domain.Members;
import com.hsbc.meetingroombookingsystem.domain.User;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingAlreadyExistsException;

public interface NewMeetingService {
	
	public void newMeeting(int uniqueID,String title,User user,LocalDate meetingDate,LocalTime startTime,LocalTime endTime,Meeting typeOfMeeting,List<User> attendies,MeetingRoom meetingroom) throws MeetingAlreadyExistsException, SQLException;

	

}

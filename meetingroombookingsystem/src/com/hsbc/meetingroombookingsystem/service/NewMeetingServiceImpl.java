package com.hsbc.meetingroombookingsystem.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.hsbc.meetingroombookingsystem.DAO.MeetingDAO;
import com.hsbc.meetingroombookingsystem.domain.Meeting;
import com.hsbc.meetingroombookingsystem.domain.MeetingRoom;
import com.hsbc.meetingroombookingsystem.domain.Members;
import com.hsbc.meetingroombookingsystem.domain.User;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingAlreadyExistsException;
import com.hsbc.meetingroombookingsystem.objectFactory.MeetingObject;

public class NewMeetingServiceImpl implements NewMeetingService{

	@Override
	public void newMeeting(int uniqueID, String title, User user, LocalDate meetingDate, LocalTime startTime,
			LocalTime endTime, Meeting typeOfMeeting, List<Members> attendies,MeetingRoom meetingRoom) throws MeetingAlreadyExistsException {
		
		Meeting newmeeting = new Meeting(uniqueID,title,user,meetingDate,startTime,endTime,typeOfMeeting,attendies,meetingRoom);
		
		MeetingDAO newmeet = MeetingObject.getInstanceof();
		newmeet.newmeeting(newmeeting);
	}

}

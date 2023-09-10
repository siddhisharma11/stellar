package com.hsbc.meetingroombookingsystem.DAO;

import com.hsbc.meetingroombookingsystem.domain.Meeting;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingAlreadyExistsException;

public class MeetingDAO {
	
	public void newmeeting(Meeting newmeeting) throws MeetingAlreadyExistsException{
		
		try {
			meetingalreadythere(newmeeting);
		}catch(MeetingAlreadyExistsException e) {
			e.printStackTrace();
		}
		
	}

	private void meetingalreadythere(Meeting newmeeting) throws MeetingAlreadyExistsException {
		throw new MeetingAlreadyExistsException("Meeting Already Exists");		
	}

}

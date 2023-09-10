package com.hsbc.meetingroombookingsystem.DAO;

import com.hsbc.meetingroombookingsystem.domain.MeetingRoom;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingRoomAlreadyExistsException;

public class MeetingRoomDAO {

	public void newmeetingroom(MeetingRoom newmeetingroom)throws MeetingRoomAlreadyExistsException {
		try {
			checkAlreadyExist(newmeetingroom);
			
		}catch(MeetingRoomAlreadyExistsException e) {
			e.printStackTrace();
			
		}
		
	}

	private void checkAlreadyExist(MeetingRoom newmeetingroom) throws MeetingRoomAlreadyExistsException {
		throw new MeetingRoomAlreadyExistsException("MeetingRoom Already Exists !!");
		
	}
	
}

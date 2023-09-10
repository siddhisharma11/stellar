package com.hsbc.meetingroombookingsystem.objectFactory;

import com.hsbc.meetingroombookingsystem.DAO.MeetingRoomDAO;

public class MeetingRoomDAOObject {
	
	static MeetingRoomDAO obj= new MeetingRoomDAO();
	
	public static MeetingRoomDAO getInstanceOF() {
		return obj;
	}

}

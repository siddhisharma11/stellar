package com.hsbc.meetingroombookingsystem.objectFactory;

import com.hsbc.meetingroombookingsystem.DAO.MeetingRoomDAO;

public class MeetingRoomObject {
static MeetingRoomDAO obj = new MeetingRoomDAO();
	
	public static MeetingRoomDAO getInstanceof() {
		return obj;
	}

}

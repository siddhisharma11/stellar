package com.hsbc.meetingroombookingsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.meetingroombookingsystem.DAO.AmenitiesDAO;
import com.hsbc.meetingroombookingsystem.DAO.MeetingRoomDAO;
import com.hsbc.meetingroombookingsystem.domain.Amenities;
import com.hsbc.meetingroombookingsystem.domain.MeetingRoom;
import com.hsbc.meetingroombookingsystem.exceptions.MeetingRoomAlreadyExistsException;
import com.hsbc.meetingroombookingsystem.objectFactory.MeetingRoomDAOObject;

public class NewMeetingRoomServiceImpl implements NewMeetingRoomService{

	@Override
	public void addnewMeetingRoom(String uniqueName, int seatingCapacity, int raating, List<String> amenitiesAvailable,
			int cost) throws MeetingRoomAlreadyExistsException { 
		List<Amenities> avilableamenities = new ArrayList();
		for(String name:amenitiesAvailable) {
			avilableamenities.add(AmenitiesDAO.getbyName(name));
		}
			MeetingRoom newmeetingroom = new MeetingRoom(uniqueName,seatingCapacity,raating,avilableamenities,cost);
			
			MeetingRoomDAO storeroom = MeetingRoomDAOObject.getInstanceOF();
			storeroom.newmeetingroom(newmeetingroom);
		
	}

}

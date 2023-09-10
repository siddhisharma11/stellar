package com.hsbc.meetingroombookingsystem.service;

import java.util.List;

import com.hsbc.meetingroombookingsystem.exceptions.MeetingRoomAlreadyExistsException;

public interface NewMeetingRoomService {
	public void addnewMeetingRoom(String uniqueName,int seatingCapacity,int raating,List<String> amenitiesAvailable,int cost) throws MeetingRoomAlreadyExistsException;

}

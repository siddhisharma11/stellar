package com.hsbc.meetingroombookingsystem.controller;

import com.hsbc.meetingroombookingsystem.DAO.MeetingRoomDAO;
import com.hsbc.meetingroombookingsystem.DAO.UserDAO;
import com.hsbc.meetingroombookingsystem.domain.User;
import com.hsbc.meetingroombookingsystem.objectFactory.MeetingRoomDAOObject;
import com.hsbc.meetingroombookingsystem.service.NewMeetingRoomServiceImpl;
import com.hsbc.meetingroombookingsystem.service.NewMeetingService;

public class NewMeetingControl {

	public static void newmeeting(int id) {
		User manager = UserDAO.getUserByUserId(id);
		System.out.println("SELECT MEETING ROOM");
		MeetingRoomDAO obj = MeetingRoomDAOObject.getInstanceOF();
		System.out.println(obj.getall());
		if(manager.getCredits()< obj.getmincredit()) {
			System.out.println("NOT ENOUGH CREDITS");
		}
		NewMeetingService newmeet = NewMeetingRoomServiceImpl();//input from users
		
	}

}

package com.hsbc.meetingroombookingsystem.controller;

import java.util.Scanner;

import com.hsbc.meetingroombookingsystem.DAO.MeetingDAO;

public class MemberControl {
	
	public MemberControl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter YOUR UNIQUE ID");
		int id = sc.nextInt();
		System.out.println("SCHUDLED MEETINGS ARE");
		System.out.println(MeetingDAO.getmeetingbyid(id));
		
	}

}

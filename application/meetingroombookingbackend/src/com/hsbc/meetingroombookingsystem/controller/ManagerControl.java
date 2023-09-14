package com.hsbc.meetingroombookingsystem.controller;

import java.util.Scanner;

public class ManagerControl {
	public ManagerControl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter YOUR UNIQUE ID");
		int id=sc.nextInt() ;
		System.out.println("OPTIONS FOR YOU");
		System.out.println("ADD NEW MEETING");
		if(sc.nextLine().equals("YES")) {
			NewMeetingControl.newmeeting(id);
			
		}
	}

}

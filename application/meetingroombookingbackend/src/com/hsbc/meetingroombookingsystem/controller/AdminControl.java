package com.hsbc.meetingroombookingsystem.controller;

import java.util.Scanner;

public class AdminControl {
	private int uniqueID;
	
	public AdminControl() //Dummy Constructor to imitate user interactions
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter YOUR UNIQUE ID");
		int id=sc.nextInt() ;
		System.out.println("OPTIONS FOR YOU");
		System.out.println("ADD NEW USER");
		if(sc.nextLine().equals("YES")) {
			System.out.println("ENTER TYPE OF USER");
			//further interactions 
		}
		System.out.println("ADD NEW MEETING ROOM");
if(sc.nextLine().equals("YES")) {
			//further Interactions
		}
		
	}

}

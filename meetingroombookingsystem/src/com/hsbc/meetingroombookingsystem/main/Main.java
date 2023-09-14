package com.hsbc.meetingroombookingsystem.main;

import java.sql.SQLException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.hsbc.meetingroombookingsystem.DAO.MeetingDAO;
import com.hsbc.meetingroombookingsystem.controller.LogIncontrol;

public class Main {
	public static void main(String[] args) throws LoginException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO MEETING SERVICE !!!");
		System.out.println("BOOKED MEETINGS ARE:");
		System.out.println(MeetingDAO.getAll());
		System.out.println("ENTER USERNAME");
		String username = sc.nextLine();
		System.out.println("ENTER PASSWORD");
		String password = sc.nextLine();
		LogIncontrol.login(username,password);
		
	}

}

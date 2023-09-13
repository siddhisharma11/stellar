package com.hsbc.meetingroombookingsystem.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;

import com.hsbc.meetingroombookingsystem.DAO.UserDAO;

public class AutoCreditGeneration {
	
	private DayOfWeek dayofweek = LocalDate.now().getDayOfWeek();
	
	public void weeklycreditupdater() {
		if(dayofweek.equals("Monday")) {
			UserDAO.creditupdate();
		}
	}
	

}

package com.hsbc.meetingroombookingsystem.controller;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.hsbc.meetingroombookingsystem.service.LogInService;
import com.hsbc.meetingroombookingsystem.service.LogInServiceImpl;

public class LogIncontrol {
	
	public static void login(String username,String password) throws LoginException, SQLException {
		LogInService login =  new LogInServiceImpl();
		String role = login.logIn(username, password);
		if(role=="ADMIN") {
			AdminControl admin=new AdminControl();
		}
if(role=="MEMBER") {
			MemberControl member=new MemberControl();
		}
if(role=="MANAGER") {
	ManagerControl manager = new ManagerControl();
	
}
	}

}

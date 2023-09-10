package com.hsbc.meetingroombookingsystem.service;

import javax.security.auth.login.LoginException;

import com.hsbc.meetingroombookingsystem.DAO.UserDAO;
import com.hsbc.meetingroombookingsystem.domain.User;

public class LogInServiceImpl implements LogInService{

	@Override
	public void logIn(String username, String password) throws LoginException {
		
		User user = UserDAO.getUserByUserName(username, password);
		
		if(user == null) {
			throw new LoginException("Username or Password Incorrect");
		}
		else
			System.out.println("logged In Sucessfully !!!");
		
	}

}

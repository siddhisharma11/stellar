package com.hsbc.meetingroombookingsystem.service;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import com.hsbc.meetingroombookingsystem.DAO.LogInDAO;


public class LogInServiceImpl implements LogInService{

	@Override
	public String logIn(String username, String password) throws LoginException, SQLException {
		
		String role=LogInDAO.LogIn(username, password);
		
		if(role == null) {
			throw new LoginException("Username or Password Incorrect");
		}
		else
			System.out.println("logged In Sucessfully !!!");
		return role;
	}

}

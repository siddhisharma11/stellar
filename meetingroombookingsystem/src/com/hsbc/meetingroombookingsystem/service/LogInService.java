package com.hsbc.meetingroombookingsystem.service;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

public interface LogInService {
	
	public String logIn(String username,String password) throws LoginException, SQLException;

}

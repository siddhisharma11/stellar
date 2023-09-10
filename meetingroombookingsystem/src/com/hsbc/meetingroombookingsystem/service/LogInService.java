package com.hsbc.meetingroombookingsystem.service;

import javax.security.auth.login.LoginException;

public interface LogInService {
	
	public void logIn(String username,String password) throws LoginException;

}

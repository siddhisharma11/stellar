package com.hsbc.meetingroombookingsystem.objectFactory;

import com.hsbc.meetingroombookingsystem.DAO.UserDAO;

public class UserObject {
static UserDAO obj = new UserDAO();
	
	public static UserDAO getInstanceof() {
		return obj;
	}

}

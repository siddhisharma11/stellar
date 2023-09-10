package com.hsbc.meetingroombookingsystem.objectFactory;

import com.hsbc.meetingroombookingsystem.DAO.UserDAO;

public class UserDAOObject {
	
	static UserDAO obj = new UserDAO();
	
	public static UserDAO getInstanceOf() {
		return obj;
	}

}

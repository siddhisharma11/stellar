package com.hsbc.meetingroombookingsystem.objectFactory;

import com.hsbc.meetingroombookingsystem.DAO.RoleDAO;

public class RoleObject {
static RoleDAO obj = new RoleDAO();
	
	public static RoleDAO getInstanceof() {
		return obj;
	}

}

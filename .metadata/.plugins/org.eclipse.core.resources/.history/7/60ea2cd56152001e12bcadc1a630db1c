package com.hsbc.meetingroombookingsystem.service;

import com.hsbc.meetingroombookingsystem.DAO.UserDAO;
import com.hsbc.meetingroombookingsystem.domain.Admin;
import com.hsbc.meetingroombookingsystem.domain.Manager;
import com.hsbc.meetingroombookingsystem.domain.Members;
import com.hsbc.meetingroombookingsystem.domain.Role;
import com.hsbc.meetingroombookingsystem.domain.User;
import com.hsbc.meetingroombookingsystem.objectFactory.UserDAOObject;

public class CreateUserServiceImpl implements CreateUserService {

	@Override
	public void newManager(String uniqueID, String name, String email, String phone, int credits, Role role) {
		User newmanager = new Manager(uniqueID,name,email,phone,credits,role);
		UserDAO object = UserDAOObject.getInstanceOf();
		object.addnewManager(newmanager);
		
	}

	@Override
	public void newAdmin(String uniqueID, String name, String email, String phone) {
		User newadmin = new Admin(uniqueID,name,email,phone);
		UserDAO object = UserDAOObject.getInstanceOf();
		object.addnewAdmin(newadmin);// TODO Auto-generated method stub
		
	}

	@Override
	public void newMember(String id, String name, String email, String phone, Role role) {
		User newmember = new Members(id,name,email,phone, role);
		UserDAO object = UserDAOObject.getInstanceOf();
		object.addnewMember(newmember);// TODO Auto-generated method stub
		
	}

		
	}



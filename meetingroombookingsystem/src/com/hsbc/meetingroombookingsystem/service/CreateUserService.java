package com.hsbc.meetingroombookingsystem.service;

import com.hsbc.meetingroombookingsystem.domain.Role;

public interface CreateUserService {
	
	public void newManager(String uniqueID,String name,String email,String phone,int credits,Role role);
	public void newAdmin(String uniqueID,String name,String email,String phone);
	public void newMember(String id, String name, String email, String phone, Role role);


}

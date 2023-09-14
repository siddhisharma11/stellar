package com.hsbc.meetingroombookingsystem.domain;

import java.util.Objects;

public class Role {
	private String name;
	
	public Role(String role) {
		this.name = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

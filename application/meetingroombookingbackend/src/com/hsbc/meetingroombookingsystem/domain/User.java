package com.hsbc.meetingroombookingsystem.domain;

import java.util.Objects;

public abstract class User {
	private int uniqueID;
	private String name;
	private String email;
	private String phone;
	private int credits;
	private Role role;
	
	
	
	@Override
	public String toString() {
		return "User [uniqueID=" + uniqueID + ", name=" + name + ", email=" + email + ", phone=" + phone + ", credits="
				+ credits + ", role=" + role + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, phone, uniqueID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(phone, other.phone)
				&& Objects.equals(uniqueID, other.uniqueID);
	}
	
	public User(int id, String name, String email, String phone) {
		this.uniqueID = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public User(int id, String name2, String email2, String phone2, Role role) {
		this.uniqueID = id;
		this.name = name2;
		this.email = email2;
		this.phone = phone2;
	}
	public User(int id, String name2, String email2, String phone2, int credits2, Role role) {
		this.uniqueID = id;
		this.name = name2;
		this.email = email2;
		this.phone = phone2;
		this.credits = credits2;
	}// TODO Auto-generated constructor stub
	
	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

}

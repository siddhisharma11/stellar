package com.hsbc.meetingroombookingsystem.domain;

import java.util.Objects;

public class Amenities {
	private String id;
	private String name;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amenities other = (Amenities) obj;
		return Objects.equals(name, other.name);
	}
	

}

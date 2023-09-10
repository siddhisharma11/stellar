package com.hsbc.meetingroombookingsystem.domain;

import java.util.Objects;

public class Role {
	private String uniqueId;
	private String name;
	
	@Override
	public String toString() {
		return "Role [uniqueId=" + uniqueId + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, uniqueId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(name, other.name) && Objects.equals(uniqueId, other.uniqueId);
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

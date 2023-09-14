package com.hsbc.meetingroombookingsystem.domain;

import java.util.List;
import java.util.Objects;

public class MeetingRoom {
	private String uniqueName;
	private int seatingCapacity;
	private int rating;
	private List<Amenities> amenitiesAvailable;
	private int cost;
	
	public MeetingRoom() {
		
	}
	
	public MeetingRoom(String uniqueName, int seatingCapacity, int rating, List<Amenities> amenitiesAvailable,
			int cost) {
	
		this.uniqueName = uniqueName;
		this.seatingCapacity = seatingCapacity;
		this.rating = rating;
		this.amenitiesAvailable = amenitiesAvailable;
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(uniqueName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeetingRoom other = (MeetingRoom) obj;
		return Objects.equals(uniqueName, other.uniqueName);
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Amenities> getAmenitiesAvailable() {
		return amenitiesAvailable;
	}
	public void setAmenitiesAvailable(List<Amenities> amenitiesAvailable) {
		this.amenitiesAvailable = amenitiesAvailable;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}

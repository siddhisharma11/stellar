package com.hsbc.meetingroombookingsystem.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Meeting {
	private int uniqueID;
	private String title;
	private User user;
	private LocalDate meetingDate;
	private LocalTime startTime;
	private LocalTime endTime;
	private Meeting typeOfMeeting;
	private List<User> attendies;
	
	
	public Meeting() {
		
	}
	
	public Meeting(int uniqueID, String title, User user, LocalDate meetingDate, LocalTime startTime, LocalTime endTime,
			Meeting typeOfMeeting, List<User> attendies, MeetingRoom meetingRoom) {
		this.uniqueID = uniqueID;
		this.title = title;
		this.user = user;
		this.meetingDate = meetingDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.typeOfMeeting = typeOfMeeting;
		this.attendies = attendies;
		this.meetingRoom = meetingRoom;
	}
	

	@Override
	public String toString() {
		return "Meeting [uniqueID=" + uniqueID + ", title=" + title + ", user=" + user + ", meetingDate=" + meetingDate
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", typeOfMeeting=" + typeOfMeeting
				+ ", attendies=" + attendies + ", meetingRoom=" + meetingRoom + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(uniqueID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meeting other = (Meeting) obj;
		return uniqueID == other.uniqueID;
	}
	private MeetingRoom meetingRoom;
	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDate getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(LocalDate meetingDate) {
		this.meetingDate = meetingDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public Meeting getTypeOfMeeting() {
		return typeOfMeeting;
	}
	public void setTypeOfMeeting(Meeting typeOfMeeting) {
		this.typeOfMeeting = typeOfMeeting;
	}
	public List<User> getAttendies() {
		return attendies;
	}
	public void setAttendies(List<User> attendies) {
		this.attendies = attendies;
	}
	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}
	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	
	

}

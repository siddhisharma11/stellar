package com.hsbc.meetingroombookingsystem.service;

import com.hsbc.meetingroombookingsystem.exceptions.AmenitiesAlreadyExistsException;

public interface CreateNewAmenities {
	public void newAmenity(String name) throws AmenitiesAlreadyExistsException;

}

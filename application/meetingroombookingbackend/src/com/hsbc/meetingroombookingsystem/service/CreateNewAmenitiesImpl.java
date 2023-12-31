package com.hsbc.meetingroombookingsystem.service;

import com.hsbc.meetingroombookingsystem.DAO.AmenitiesDAO;
import com.hsbc.meetingroombookingsystem.domain.Amenities;
import com.hsbc.meetingroombookingsystem.exceptions.AmenitiesAlreadyExistsException;
import com.hsbc.meetingroombookingsystem.objectFactory.AmenitiesDAOObject;

public class CreateNewAmenitiesImpl implements CreateNewAmenities{

	@Override
	public void newAmenity(String name) throws AmenitiesAlreadyExistsException {
		Amenities newAmenity = new Amenities(name);
		AmenitiesDAO obj = AmenitiesDAOObject.getInstanceOf();
		obj.addamenity(newAmenity);
	}
	
}

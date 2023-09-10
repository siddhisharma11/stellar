package com.hsbc.meetingroombookingsystem.DAO;

import com.hsbc.meetingroombookingsystem.domain.Amenities;
import com.hsbc.meetingroombookingsystem.exceptions.AmenitiesAlreadyExistsException;

public class AmenitiesDAO {
	private Amenities newAmenity;
	
	public void addamenity(Amenities newAmenity) {
		try {
			checkexistance(newAmenity);
		} catch (AmenitiesAlreadyExistsException e) {
			e.printStackTrace();
		}
	}
	
	public void checkexistance(Amenities newAmenity) throws AmenitiesAlreadyExistsException {
		
		throw new AmenitiesAlreadyExistsException("Amenity already exists !!!");
	}
	
	public static Amenities getbyName(String name) {
		
		//send amenity name from here 
		return null;
	}

}

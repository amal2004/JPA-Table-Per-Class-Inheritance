package com.hibernate.map.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Car extends PassengerVehicle {

	private int noOfDoors;

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

}
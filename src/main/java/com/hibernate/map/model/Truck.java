package com.hibernate.map.model;

import javax.persistence.Entity;

@Entity
public class Truck extends TransportationVehicle{
 
	private int noOfContainers;
 
	public int getNoOfContainers() {
		return noOfContainers;
	}
 
	public void setNoOfContainers(int noOfContainers) {
		this.noOfContainers = noOfContainers;
	}
 
}
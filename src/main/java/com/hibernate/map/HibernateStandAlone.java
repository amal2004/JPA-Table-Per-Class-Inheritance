package com.hibernate.map;

import org.hibernate.Session;

import com.hibernate.map.model.Bike;
import com.hibernate.map.model.Car;
import com.hibernate.map.model.Truck;


public class HibernateStandAlone {
	
	 public static void main(String[] args) {
	
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	 
	        Bike cbr1000rr = new Bike();
	        cbr1000rr.setManufacturer("honda");
	        cbr1000rr.setNoOfpassengers(1);
	        cbr1000rr.setSaddleHeight(30);
	        session.save(cbr1000rr);
	         
	        Car avantador = new Car();
	        avantador.setManufacturer("lamborghini");
	        avantador.setNoOfDoors(2);
	        avantador.setNoOfpassengers(2);
	        session.save(avantador);
	         
	        Truck truck = new Truck();
	        truck.setLoadCapacity(100);
	        truck.setManufacturer("mercedes");
	        truck.setNoOfContainers(2);
	        session.save(truck);
	        	        
	      
	        session.getTransaction().commit();
	        session.close();  
	    }

}

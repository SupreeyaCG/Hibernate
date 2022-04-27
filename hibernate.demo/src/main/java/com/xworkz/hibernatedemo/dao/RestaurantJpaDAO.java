package com.xworkz.hibernatedemo.dao;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantJpaDAO {
	
public void saveRestaurantJPA(RestaurantEntity entity) {
			
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpa" );
	    
	    EntityManager entitymanager = emfactory.createEntityManager( );
	    entitymanager.getTransaction().begin( );

	       entitymanager.persist( entity );
	    entitymanager.getTransaction( ).commit( );

	    entitymanager.close( );
	    emfactory.close( );
}

}

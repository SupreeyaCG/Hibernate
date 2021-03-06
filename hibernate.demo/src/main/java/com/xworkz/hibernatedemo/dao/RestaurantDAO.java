package com.xworkz.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantDAO {
	

	public void saveRestaurant(RestaurantEntity entity) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(entity);
		tx.commit();
		
		/*EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA");
        
	 EntityManager entitymanager = emfactory.createEntityManager( );
	  entitymanager.getTransaction( ).begin( );
	      
  entitymanager.persist(entity);
	    entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
      */
		
		
	}

}

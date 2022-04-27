package com.xworkz.hibernatedemo.entity;

import com.xworkz.hibernatedemo.dao.RestaurantJpaDAO;

public class JpaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantEntity entity = new RestaurantEntity();
		entity.setContactNo(125478);
		entity.setType("veg");
		entity.setName("Mirchi Veeranna");
		entity.setRestaurantId(3);
		entity.setRating(5);
		
		RestaurantJpaDAO jpaDao=new RestaurantJpaDAO();
		jpaDao.saveRestaurantJPA(entity);
		System.out.println("saved sucessfully....!");
	}

}

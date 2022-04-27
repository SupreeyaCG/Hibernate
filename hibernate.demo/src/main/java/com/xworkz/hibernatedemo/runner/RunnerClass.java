package com.xworkz.hibernatedemo.runner;

import com.xworkz.hibernatedemo.dao.RestaurantJpaDAO;
import com.xworkz.hibernatedemo.entity.RestaurantEntity;

public class RunnerClass {

	public static void main(String[] args) {
		
		RestaurantEntity restaurantEntity = new RestaurantEntity();
		restaurantEntity.setRestaurantId(1);
		restaurantEntity.setContactNo(12345);
		restaurantEntity.setName("Udupi");
		restaurantEntity.setRating(4.50);
		restaurantEntity.setType("Veg");

		RestaurantJpaDAO restaurantDAO = new RestaurantJpaDAO();
		restaurantDAO.saveRestaurantJPA(restaurantEntity);
		System.out.println("Saved successfully");
	}

}

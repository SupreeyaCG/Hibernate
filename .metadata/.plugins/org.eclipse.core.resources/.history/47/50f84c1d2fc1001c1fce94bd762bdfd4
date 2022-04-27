package com.xworkz.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
	
	@Id
	@Column(name = "id")
	private int restaurantId;
	@Column(name = "contact_no")
	private long contactNo;
	private String name;
	private String type;
	private double rating;
	

}

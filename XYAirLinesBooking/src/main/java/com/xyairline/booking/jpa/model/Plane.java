package com.xyairline.booking.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plane")
public class Plane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "planeid", updatable = false, nullable = false)
	private int planeid;
	
	private String planeName;
	private String carearName;
	
	private int noOfSeats;

	public int getPlaneid() {
		return planeid;
	}

	public void setPlaneid(int planeid) {
		this.planeid = planeid;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public String getCarearName() {
		return carearName;
	}

	public void setCarearName(String carearName) {
		this.carearName = carearName;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	

	
}

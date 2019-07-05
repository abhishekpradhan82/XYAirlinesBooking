package com.xyairline.booking.model;

public class PlaneModel {
	
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

	public PlaneModel(int planeid, String planeName, String carearName, int noOfSeats) {
		super();
		this.planeid = planeid;
		this.planeName = planeName;
		this.carearName = carearName;
		this.noOfSeats = noOfSeats;
	}
	

}

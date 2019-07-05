package com.xyairline.booking.model;

import java.time.LocalDateTime;

public class Flight {
	
	private int flightId;
	
	private String flightName;
	private float flightPrice;
	private int planeid;
	private int routeId;
	
	private LocalDateTime flightStartDateTime;
	private LocalDateTime flightEndDateTime;
	
	public Flight() {
		super();
	}
	

	public Flight(int flightId, String flightName, float flightPrice, int planeid, int routeId,
			LocalDateTime flightStartDateTime, LocalDateTime flightEndDateTime) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightPrice = flightPrice;
		this.planeid = planeid;
		this.routeId = routeId;
		this.flightStartDateTime = flightStartDateTime;
		this.flightEndDateTime = flightEndDateTime;
	}
	
	public LocalDateTime getFlightStartDateTime() {
		return flightStartDateTime;
	}
	public void setFlightStartDateTime(LocalDateTime flightStartDateTime) {
		this.flightStartDateTime = flightStartDateTime;
	}
	public LocalDateTime getFlightEndDateTime() {
		return flightEndDateTime;
	}
	public void setFlightEndDateTime(LocalDateTime flightEndDateTime) {
		this.flightEndDateTime = flightEndDateTime;
	}
	public int getPlaneid() {
		return planeid;
	}
	public void setPlaneid(int planeid) {
		this.planeid = planeid;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public float getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(float flightPrice) {
		this.flightPrice = flightPrice;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", flightPrice=" + flightPrice
				+ ", planeid=" + planeid + ", routeId=" + routeId + ", flightStartDateTime=" + flightStartDateTime
				+ ", flightEndDateTime=" + flightEndDateTime + "]";
	}
	
	
	
}

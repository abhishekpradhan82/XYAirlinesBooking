package com.xyairline.booking.model;

import java.util.List;

public class FlightListModel{
	
	private List<Flight> flights;

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "FlightModel [flights=" + flights + "]";
	}
	
	
	
}

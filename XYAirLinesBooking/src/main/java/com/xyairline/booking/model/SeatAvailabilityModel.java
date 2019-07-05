package com.xyairline.booking.model;

import java.time.LocalDateTime;

public class SeatAvailabilityModel {
	
	private Flight flt;
	private int NoOfOpenSeats;
	private int NoOfTotalSeats;
	private LocalDateTime asofDt;
	
	public SeatAvailabilityModel()
	{
		super();
	}
	
	public SeatAvailabilityModel(Flight flt, int noOfOpenSeats, int noOfTotalSeats, LocalDateTime asofDt) {
		super();
		this.flt = flt;
		NoOfOpenSeats = noOfOpenSeats;
		NoOfTotalSeats = noOfTotalSeats;
		this.asofDt = asofDt;
	}
	
	public Flight getFlt() {
		return flt;
	}
	public void setFlt(Flight flt) {
		this.flt = flt;
	}
	public int getNoOfOpenSeats() {
		return NoOfOpenSeats;
	}
	public void setNoOfOpenSeats(int noOfOpenSeats) {
		NoOfOpenSeats = noOfOpenSeats;
	}
	public int getNoOfTotalSeats() {
		return NoOfTotalSeats;
	}
	public void setNoOfTotalSeats(int noOfTotalSeats) {
		NoOfTotalSeats = noOfTotalSeats;
	}
	public LocalDateTime getAsofDt() {
		return asofDt;
	}
	public void setAsofDt(LocalDateTime asofDt) {
		this.asofDt = asofDt;
	}
	
	

}

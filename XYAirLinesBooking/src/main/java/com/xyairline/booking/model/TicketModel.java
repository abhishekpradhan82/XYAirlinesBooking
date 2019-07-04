package com.xyairline.booking.model;

import com.xyairline.booking.jpa.model.Ticket;

public class TicketModel {
	
	private Ticket tkt;
	private boolean isSuccess;
	
	public Ticket getTkt() {
		return tkt;
	}
	public void setTkt(Ticket tkt) {
		this.tkt = tkt;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	

}

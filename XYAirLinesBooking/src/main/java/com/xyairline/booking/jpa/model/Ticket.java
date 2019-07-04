package com.xyairline.booking.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticketId", updatable = false, nullable = false)
	private int ticketId;
	
	private String pgr_full_nm;
	
	private float ticket_price;
	private String ticket_status;
	private int flightId;
	
	public Ticket()
	{
		this.ticketId=-1;
	}
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getPgr_full_nm() {
		return pgr_full_nm;
	}
	public void setPgr_full_nm(String pgr_full_nm) {
		this.pgr_full_nm = pgr_full_nm;
	}
	public float getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(float ticket_price) {
		this.ticket_price = ticket_price;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", pgr_full_nm=" + pgr_full_nm + ", ticket_price=" + ticket_price
				+ ", ticket_status=" + ticket_status + ", flightId=" + flightId + "]";
	}



}

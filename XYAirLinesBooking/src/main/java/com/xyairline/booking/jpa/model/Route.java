package com.xyairline.booking.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {
	
	
	@Id
	@Column(name = "routeid", updatable = false, nullable = false)
	private int routeId;
	
	private String from_loc_name;
	private String to_loc_name;
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getFrom_loc_name() {
		return from_loc_name;
	}
	public void setFrom_loc_name(String from_loc_name) {
		this.from_loc_name = from_loc_name;
	}
	public String getTo_loc_name() {
		return to_loc_name;
	}
	public void setTo_loc_name(String to_loc_name) {
		this.to_loc_name = to_loc_name;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", from_loc_name=" + from_loc_name + ", to_loc_name=" + to_loc_name + "]";
	}
	
	
	
	
}

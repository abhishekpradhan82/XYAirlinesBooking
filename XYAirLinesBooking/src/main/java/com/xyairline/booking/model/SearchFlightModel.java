package com.xyairline.booking.model;

import java.time.LocalDateTime;

public class SearchFlightModel {
	
	private String fromLoc;
	private String toLoc;
	private LocalDateTime dtFrom = LocalDateTime.now();
	private LocalDateTime dtTo = LocalDateTime.now();
	private int rangeHr;
	
	public int getRangeHr() {
		return rangeHr;
	}
	public void setRangeHr(int rangeHr) {
		this.rangeHr = rangeHr;
	}
	public String getFromLoc() {
		return fromLoc;
	}
	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}
	public String getToLoc() {
		return toLoc;
	}
	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	public LocalDateTime getDtFrom() {
		return dtFrom;
	}
	public void setDtFrom(LocalDateTime dtFrom) {
		this.dtFrom = dtFrom;
	}
	public LocalDateTime getDtTo() {
		return dtTo;
	}
	public void setDtTo(LocalDateTime dtTo) {
		this.dtTo = dtTo;
	}
	
	public SearchFlightModel(String fromLoc, String toLoc, LocalDateTime dtFrom, LocalDateTime dtTo,int rangeHr) {
		super();
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.dtFrom = dtFrom;
		this.dtTo = dtTo;
		this.rangeHr = rangeHr;
	}
	
	public SearchFlightModel()
	{
		
	}
	@Override
	public String toString() {
		return "SearchFlightModel [fromLoc=" + fromLoc + ", toLoc=" + toLoc + ", dtFrom=" + dtFrom + ", dtTo=" + dtTo
				+ ", rangeHr=" + rangeHr + "]";
	}


	
	

}

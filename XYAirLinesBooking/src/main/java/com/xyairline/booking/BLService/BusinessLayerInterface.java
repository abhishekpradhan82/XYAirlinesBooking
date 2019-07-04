package com.xyairline.booking.BLService;

import com.xyairline.booking.exception.TicketException;
import com.xyairline.booking.model.FlightListModel;
import com.xyairline.booking.model.SearchFlightModel;
import com.xyairline.booking.model.SeatAvailabilityModel;
import com.xyairline.booking.model.TicketModel;

public interface BusinessLayerInterface {
	
	FlightListModel getFlightDetails(int flid) ;
	
	//FlightListModel findAvailableFlights(String fromLoc, LocalDateTime dtFrom, String toLoc, LocalDateTime dtTo,int rangeHr);
	
	FlightListModel findAvailableFlights(SearchFlightModel searchFlight);
	
	SeatAvailabilityModel findAvailableSeats(int flid);
	
	TicketModel bookMyTicket(TicketModel tm) throws TicketException;
	
	TicketModel cancelMyTicket(int tickedid) throws TicketException;
	

}

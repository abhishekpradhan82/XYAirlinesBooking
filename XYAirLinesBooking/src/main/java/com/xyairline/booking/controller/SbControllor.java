package com.xyairline.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyairline.booking.BLService.BusinessLayerImpl;
import com.xyairline.booking.exception.TicketException;
import com.xyairline.booking.model.FlightListModel;
import com.xyairline.booking.model.SearchFlightModel;
import com.xyairline.booking.model.SeatAvailabilityModel;
import com.xyairline.booking.model.TicketModel;

@RestController
@RequestMapping("/XYAirlines")
public class SbControllor {
	
	@Autowired
	BusinessLayerImpl blService;
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	
	@PostMapping("/getAvailableFlights")
	@ResponseBody
	public FlightListModel getAvailableFlights(@RequestBody SearchFlightModel searchFlight)
	{

		return blService.findAvailableFlights(searchFlight);
		
	}
	
	@RequestMapping("/getFlightDetails/{flid}")
	public FlightListModel getFlightDetails(@PathVariable("flid") int flid)
	{	
		return blService.getFlightDetails(flid);
		
	}
	
	@RequestMapping("/getAvailableSeats/{flid}")
	public SeatAvailabilityModel findAvailableSeats(@PathVariable("flid") int flid)
	{	
		return blService.findAvailableSeats(flid);
		
	}
	
	@PostMapping("/bookTickets")
	public TicketModel bookMyTickets(@RequestBody TicketModel tm)
			throws TicketException
	{	
		return blService.bookMyTicket(tm);
		
	}
	
	@PutMapping("/cancelTicket/{tktid}")
	public TicketModel bookMyTickets(@PathVariable("tktid")  int ticketId)
			throws TicketException
	{	
		return blService.cancelMyTicket(ticketId);
		
	}
	
}

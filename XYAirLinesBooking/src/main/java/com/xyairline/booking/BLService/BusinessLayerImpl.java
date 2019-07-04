package com.xyairline.booking.BLService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xyairline.booking.exception.TicketException;
import com.xyairline.booking.jpa.dao.FlightCRUD;
import com.xyairline.booking.jpa.dao.PlaneCRUD;
import com.xyairline.booking.jpa.dao.RouteCRUD;
import com.xyairline.booking.jpa.dao.TicketCRUD;
import com.xyairline.booking.jpa.model.Flight;
import com.xyairline.booking.jpa.model.Plane;
import com.xyairline.booking.jpa.model.Route;
import com.xyairline.booking.jpa.model.Ticket;
import com.xyairline.booking.model.FlightListModel;
import com.xyairline.booking.model.SearchFlightModel;
import com.xyairline.booking.model.SeatAvailabilityModel;
import com.xyairline.booking.model.TicketModel;

@Service
public class BusinessLayerImpl implements BusinessLayerInterface {
	
	
	@Autowired
	FlightCRUD flightDao;
	
	@Autowired
	RouteCRUD routeDao;
	
	@Autowired
	PlaneCRUD planeDao;
	
	@Autowired
	TicketCRUD ticketDao;

	
	@Override
	public FlightListModel findAvailableFlights(SearchFlightModel searchFlight) {
		// TODO Auto-generated method stub
		return findAvailableFlights(searchFlight.getFromLoc(),searchFlight.getDtFrom(),searchFlight.getToLoc(),searchFlight.getDtTo(),searchFlight.getRangeHr());
	}


	private FlightListModel findAvailableFlights(String fromLoc, LocalDateTime dtFrom, String toLoc, LocalDateTime dtTo,int rangeHr) {
		
		List<Route> routes= routeDao.getRouteByFromAndTo(fromLoc, toLoc);
		
		int rid = routes.get(0).getRouteId();
		
		List<Flight> flts = flightDao.getFlightsByRoute(rid);
		
		List<Flight> fltsOntheDay = flts.stream()
			.filter(f->f.getFlightStartDateTime().getDayOfYear()==dtFrom.getDayOfYear())
			.filter(f->f.getFlightEndDateTime().getDayOfYear()==dtTo.getDayOfYear())
			.filter(f->Math.abs(f.getFlightStartDateTime().getHour() - dtFrom.getHour())<rangeHr)
			.filter(f->Math.abs(f.getFlightEndDateTime().getHour() - dtTo.getHour())<rangeHr)
			.collect(Collectors.toList());
		
		FlightListModel fv = new FlightListModel();
		fv.setFlights(fltsOntheDay);
		return fv;
	}


	@Override
	public FlightListModel getFlightDetails(int flid) {
		
		FlightListModel fv = new FlightListModel();
		
		Flight fl = flightDao.findById(flid).orElse(new Flight());
		
		fv.setFlights(Arrays.asList(fl));
		
		// TODO Auto-generated method stub
		return fv;
	}


	@Override
	public SeatAvailabilityModel findAvailableSeats(int flid) {
		// TODO Auto-generated method stub
		
		SeatAvailabilityModel sam = new  SeatAvailabilityModel();
		
		Flight fl = flightDao.findById(flid).orElse(new Flight());
		Plane p = planeDao.findById(fl.getPlaneid()).orElse(new Plane());
		int totalSeats = p.getNoOfSeats();
		int bookedSeats = ticketDao.getBookedSeatCount(flid);
		
		sam.setFlt(fl);
		sam.setAsofDt(LocalDateTime.now());
		sam.setNoOfOpenSeats(totalSeats-bookedSeats);
		sam.setNoOfTotalSeats(totalSeats);
		
		return sam;
	}
	
	


	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = TicketException.class)
	public TicketModel bookMyTicket(TicketModel tm) throws TicketException
	{
		
		return bookTickets(tm);
		
	}

	@Transactional(propagation = Propagation.MANDATORY)
	private TicketModel bookTickets(TicketModel tm) throws TicketException
	{
		
		
		
		Flight fl = flightDao.findById(tm.getTkt().getFlightId()).orElse(new Flight());
		Ticket savedTk;
		TicketModel tmres = new TicketModel();
		tmres.setSuccess(false);
		
		if(fl.getFlightPrice()==tm.getTkt().getTicket_price())
		{
			Ticket tk = new Ticket();
			tk.setFlightId(tm.getTkt().getFlightId());
			tk.setPgr_full_nm(tm.getTkt().getPgr_full_nm());
			tk.setTicket_price(tm.getTkt().getTicket_price());
			tk.setTicket_status("booked");
			
			savedTk = ticketDao.save(tk);
			
		}
		else
		{
			throw new TicketException("Price mismatch error : The ticket prices have changed. BuyPrice " + tm.getTkt().getTicket_price() + " vs Actual Price " + fl.getFlightPrice());
		}
		
		tmres.setTkt(savedTk);
		tmres.setSuccess(true);
		// TODO Auto-generated method stub
		return tmres;
		
	}
	

	@Override
	public TicketModel cancelMyTicket(int tickedid)  throws TicketException {
		// TODO Auto-generated method stub
		
		
		return cancelTickets(tickedid);
	}
	
	
	@Transactional(propagation = Propagation.MANDATORY)
	private TicketModel cancelTickets(int tickedid) throws TicketException
	{
		
		Ticket savedTk = new Ticket();
		Ticket tk = ticketDao.findById(tickedid).orElse(savedTk);
		
		//System.out.println(tk);
		
		TicketModel tm = new TicketModel();
		tm.setSuccess(false);
		
		if(tk.getTicketId()>0)
		{
			if(tk.getTicket_status().equals("booked"))
			{
				tk.setTicket_status("cancelled");
				savedTk = ticketDao.save(tk);
			}
			else
			{
				throw new TicketException("Invalid Ticket status. Cannot be cancelled");
			}
		}
		else
		{
			throw new TicketException("Invalid Ticket!!.");
		}
		
		tm.setTkt(savedTk);
		tm.setSuccess(true);

		return tm;
		
	}



	
	
	
}

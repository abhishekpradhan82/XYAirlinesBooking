package com.xyairline.booking.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xyairline.booking.jpa.model.Ticket;

@Repository
public interface TicketCRUD extends JpaRepository<Ticket, Integer> {

	@Query("select count(t) FROM Ticket t where t.flightId = ?1 and t.ticket_status = 'booked'")
	int getBookedSeatCount(int flid);

}

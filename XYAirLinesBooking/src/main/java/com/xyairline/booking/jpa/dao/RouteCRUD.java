package com.xyairline.booking.jpa.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xyairline.booking.jpa.model.Route;

@Repository
public interface RouteCRUD extends JpaRepository<Route, Integer> {

	@Query("select r FROM Route r where r.from_loc_name = ?1 and r.to_loc_name =?2")
	List<Route> getRouteByFromAndTo(String fromLoc, String toLoc);
	
}

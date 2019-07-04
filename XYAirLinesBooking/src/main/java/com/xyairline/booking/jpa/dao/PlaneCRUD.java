package com.xyairline.booking.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyairline.booking.jpa.model.Plane;

@Repository
public interface PlaneCRUD extends JpaRepository<Plane, Integer> {


}

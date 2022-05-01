package com.springrest.springrest.dao;

import com.springrest.springrest.entitites.TravelDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface travelDetailsDao extends JpaRepository<TravelDetails,Long> {
}

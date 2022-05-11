package com.springrest.springrest.dao;

import com.springrest.springrest.entitites.TravelDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface travelDetailsDao extends JpaRepository<TravelDetails,Long> {

    @Query(value = "SELECT * FROM TravelDetails td order by td.travelDate DESC",nativeQuery = true)
    List<TravelDetails> findAllDetails();

    //just to get info that if this student has added info about earlier travels so that we can update it.
    @Query(value = "SELECT td.id FROM TravelDetails td where td.rollno =?1",nativeQuery = true)
    List<Long> findIdByRoll(String rollno);
}

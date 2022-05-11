package com.springrest.springrest.services;

import com.springrest.springrest.entitites.TravelDetails;

import java.util.List;

public interface TravelDetailsService {
    public TravelDetails addDetails(TravelDetails details);

    public List<TravelDetails> getAllDetails();

    public String getEmailByRollNo(String rollno);

    public boolean hasTravelled(String email);

}

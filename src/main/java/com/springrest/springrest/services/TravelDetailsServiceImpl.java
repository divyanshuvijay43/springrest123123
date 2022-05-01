package com.springrest.springrest.services;

import com.springrest.springrest.dao.travelDetailsDao;
import com.springrest.springrest.entitites.TravelDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelDetailsServiceImpl implements TravelDetailsService {

    @Autowired
    private travelDetailsDao travelDetDao;

    public TravelDetails addDetails(TravelDetails details)
    {
        travelDetDao.save(details);
        return details;
    }

    @Override
    public List<TravelDetails> getAllDetails() {
        return travelDetDao.findAll();
    }


}

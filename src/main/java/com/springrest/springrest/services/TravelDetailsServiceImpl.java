package com.springrest.springrest.services;

import com.springrest.springrest.dao.studentRegisterDao;
import com.springrest.springrest.dao.travelDetailsDao;
import com.springrest.springrest.entitites.StudentRegistration;
import com.springrest.springrest.entitites.TravelDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelDetailsServiceImpl implements TravelDetailsService {

    @Autowired
    private travelDetailsDao travelDetDao;

    @Autowired
    private studentRegisterDao studentRegisterDao;

    public TravelDetails addDetails(TravelDetails details)
    {
        List<Long> res = travelDetDao.findIdByRoll(details.getRollno());
        if(!res.isEmpty())
        {
            details.setId(res.get(0));
        }
        travelDetDao.save(details);
        return details;
    }

    @Override
    public List<TravelDetails> getAllDetails() {
        return travelDetDao.findAllDetails();
    }

    @Override
    public String getEmailByRollNo(String rollno) {
        List<String> email = studentRegisterDao.findEmailByRollno(rollno);
        if(!email.isEmpty())
        {
            return email.get(0);
        }
        else
        {
            return "";
        }
    }


    @Override
    public boolean hasTravelled(String email)
    {
        StudentRegistration st = studentRegisterDao.findByEmail(email);
        List<Long> details = travelDetDao.findIdByRoll(st.getRollno());
        if(details.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}

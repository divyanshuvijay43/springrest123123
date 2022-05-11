package com.springrest.springrest.controller;

import com.springrest.springrest.entitites.TravelDetails;
import com.springrest.springrest.services.EmailService;
import com.springrest.springrest.services.TravelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("travel")
public class travelController {
    @Autowired
    private TravelDetailsService travelDetService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/addDetails")
    public TravelDetails addDetails(@RequestBody TravelDetails details){
        return travelDetService.addDetails(details);
    }

    @GetMapping("/getDetails")
    public List<TravelDetails> getAllDetails()
    {
        return travelDetService.getAllDetails();
    }

    @PostMapping("/sendMail/{rollno}")
    public boolean sendMail(String rollno)
    {
        //add Code to fetch email
        String Subj = "Let's Connect for travel";
        String mailBody = "Hi buddy, we are travelling on same date so lets connect and share the journey";
        return emailService.sendEmail(Subj,mailBody,"dvijay11nov1997@gmail.com");
    }
}

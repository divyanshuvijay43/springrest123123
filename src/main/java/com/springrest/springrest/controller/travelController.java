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

    @PostMapping("/sendMail/{rollno}/{senderMail}")
    public boolean sendMail(@PathVariable String rollno,@PathVariable String senderMail)
    {
        //add Code to fetch email
        String senderemailId = senderMail;
        String emailId = travelDetService.getEmailByRollNo(rollno);
        emailId = (emailId == "")? "dvijay11nov1997@gmail.com":emailId;
        String Subj = "Let's Connect for travel";
        String mailBody = "Hi buddy, we are travelling on same date so lets connect and share the journey.My email Id is "+senderemailId+" Looking forward for a great company!!!";
        return emailService.sendEmail(Subj,mailBody,emailId);
    }

    @GetMapping("/hasTravelled/{email}")
    public boolean hasTravelled(@PathVariable String email)
    {
        return travelDetService.hasTravelled(email);
    }

}

package com.springrest.springrest.controller;

import com.springrest.springrest.entitites.TravelDetails;
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

    @PostMapping("/addDetails")
    public TravelDetails addDetails(@RequestBody TravelDetails details){
        return travelDetService.addDetails(details);
    }

    @GetMapping("/getDetails")
    public List<TravelDetails> getAllDetails()
    {
        return travelDetService.getAllDetails();
    }
}

package com.springrest.springrest.controller;

import com.springrest.springrest.entitites.LoginRequest;
import com.springrest.springrest.entitites.StudentRegistration;
import com.springrest.springrest.entitites.TravelDetails;
import com.springrest.springrest.entitites.WardenRegistration;
import com.springrest.springrest.services.LoginService;
import com.springrest.springrest.services.TravelDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("student")
public class studentController {
    @Autowired
    private LoginService loginservice;

    @PostMapping("/register")
    public Integer registerStudent(@RequestBody StudentRegistration Student)
    {
        Student.setRole(1);
        return loginservice.registerStudent(Student);
    }

    @PostMapping("/registerWarden")
    public Integer registerWarden(@RequestBody WardenRegistration warden)
    {
        warden.setRole(2);
        return loginservice.registerWarden(warden);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginStudent(@RequestBody LoginRequest loginReq)
    {
        Integer verification = loginservice.loginStudent(loginReq);
        if(verification != 0)
        {
            return new ResponseEntity<>(verification,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/getInfo/{email}")
    public StudentRegistration getInfoByEmail(@PathVariable String email)
    {
            return loginservice.getStudentInfoByEmail(email);
    }

    @GetMapping("/getRole/{id}")
    public Integer getRoleById(@PathVariable Integer id)
    {
        return loginservice.getRoleById(id);
    }

}

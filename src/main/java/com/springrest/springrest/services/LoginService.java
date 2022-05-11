package com.springrest.springrest.services;

import com.springrest.springrest.entitites.LoginRequest;
import com.springrest.springrest.entitites.StudentRegistration;
import com.springrest.springrest.entitites.WardenRegistration;

public interface LoginService {
    public Integer registerStudent(StudentRegistration student);

    public Integer loginStudent(LoginRequest loginReq);

    public Integer registerWarden(WardenRegistration warden);

    public StudentRegistration getStudentInfoByEmail(String email);

    public Integer getRoleById(Integer Id);
}

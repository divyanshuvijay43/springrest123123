package com.springrest.springrest.services;

import com.springrest.springrest.entitites.LoginRequest;
import com.springrest.springrest.entitites.StudentRegistration;

public interface LoginService {
    public Integer registerStudent(StudentRegistration student);

    public Integer loginStudent(LoginRequest loginReq);
}

package com.springrest.springrest.services;

import com.springrest.springrest.dao.studentRegisterDao;
import com.springrest.springrest.entitites.LoginRequest;
import com.springrest.springrest.entitites.StudentRegistration;
import com.springrest.springrest.entitites.WardenRegistration;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private com.springrest.springrest.dao.studentRegisterDao studentRegDao;

    @Override
    public Integer registerStudent(StudentRegistration student) {
        studentRegDao.save(student);
        StudentRegistration s1 = studentRegDao.getById(student.getId());
        return s1.getId();
    }

    @Override
    public Integer loginStudent(LoginRequest loginReq) {
        String email = loginReq.getEmail();
        String password = loginReq.getPassword();
        Object res = Hibernate.unproxy(studentRegDao.findByUsername(email,password));
        List<Integer> c1 = (List<Integer>)res;
        if(c1.isEmpty())
        {
            return 0;
        }
        else
        {
            return c1.get(0);
        }
    }

    @Override
    public Integer registerWarden(WardenRegistration warden) {
        StudentRegistration entry = new StudentRegistration();
        entry.setName(warden.getName());
        entry.setPassword(warden.getPassword());
        entry.setRole(warden.getRole());
        entry.setEmailId(warden.getEmailId());
        studentRegDao.save(entry);
        String email = warden.getEmailId();
        String password = warden.getPassword();
        Object res = Hibernate.unproxy(studentRegDao.findByUsername(email,password));
        List<Integer> c1 = (List<Integer>)res;
        if(c1.isEmpty())
        {
            return 0;
        }
        else
        {
            return c1.get(0);
        }
    }

    @Override
    public StudentRegistration getStudentInfoByEmail(String email) {
        Object res = Hibernate.unproxy(studentRegDao.findByEmail(email));
        if(res!=null)
        {
            return (StudentRegistration)res;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Integer getRoleById(Integer Id) {
        return studentRegDao.findRoleById(Id);
    }


}

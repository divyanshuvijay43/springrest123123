package com.springrest.springrest.dao;

import com.springrest.springrest.entitites.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface studentRegisterDao extends JpaRepository<StudentRegistration,Integer> {

    @Query(value = "SELECT st.id FROM student_registration st where st.email_Id =?1 and st.password =?2",nativeQuery = true)
    List<Integer> findByUsername(String email,String password);
}

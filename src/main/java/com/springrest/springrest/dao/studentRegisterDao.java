package com.springrest.springrest.dao;

import com.springrest.springrest.entitites.LoginResponse;
import com.springrest.springrest.entitites.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface studentRegisterDao extends JpaRepository<StudentRegistration,Integer> {

    @Query(value = "SELECT st.id FROM StudentRegistration st where st.emailId =?1 and st.password =?2",nativeQuery = true)
    List<Integer> findByUsername(String email, String password);

    @Query(value = "SELECT * FROM StudentRegistration st where st.emailId =?1",nativeQuery = true)
    StudentRegistration findByEmail(String email);

    @Query(value = "SELECT st.role FROM StudentRegistration st where st.id = ?1",nativeQuery = true)
    Integer findRoleById(Integer id);
}

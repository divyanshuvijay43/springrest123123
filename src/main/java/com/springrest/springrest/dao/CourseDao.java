package com.springrest.springrest.dao;

import com.springrest.springrest.entitites.Course;
import org.springframework.data.jpa.repository.JpaRepository;

//In the pair ahead of JpaRepository we have to specify the entity name on which this will perform add,insert,delete
//operations and other thing is we have to specify the datatype of primary key.
public interface CourseDao extends JpaRepository<Course,Long> {
}

package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entitites.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    // just declaartion we havnt created object of list yet
    List<Course> list;

    //for dependency injection sprng boot will create object of Implementation of CourseDao interface
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl()
    {
        list = new ArrayList<>();
        list.add(new Course(1,"Maths","Mathematics"));
        list.add(new Course(2,"Science","Rocket-Science"));
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
        //return list;
    }

    @Override
    public Course getCourse(long CourseId) {
//        Course c1 = new Course(1,"Python","This is a basic python course");
//        return c1;
        return courseDao.getById(CourseId);
    }

    @Override
    public Course addCourse(Course course) {
//        this.list.add(course);
//        courseDao.deleteById(course.getId());
        return courseDao.save(course);
        //This save is used for both insert as well as update because if the Id is already existing then it will update
        //otherwise it will insert.
//        return course;
    }


}

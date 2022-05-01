package com.springrest.springrest.controller;

import com.springrest.springrest.entitites.Course;
import com.springrest.springrest.services.CourseService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mycontroll")
public class MyController {

    //Now to use it we need to create an object of the implementation class of CourseService Interface
    //for that we will use autowire to inject that object here in this courseService
    //Also before autowiring we need to specify sprng boot that CourseServiceImpl class will work on service
    //layer so we will add @Service annotation over that CourseServiceImpl class.
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "Hi hero!!!";
    }

    //get the list of courses
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        Course c2 = this.courseService.getCourse(Long.parseLong(courseId));
        System.out.println(c2.getId());
        System.out.println(c2.getDescription());
        System.out.println(c2.getName());
        Object unproxiedEntity = Hibernate.unproxy(c2);
        c2 = (Course) unproxiedEntity;
        return c2;
    }

    @PostMapping("courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }
}

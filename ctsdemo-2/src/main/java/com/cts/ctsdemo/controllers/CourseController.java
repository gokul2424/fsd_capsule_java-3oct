package com.cts.ctsdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ctsdemo.entities.Course;
import com.cts.ctsdemo.repos.CourseRepo;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepo repo;

	
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public List<Course> findAllCourses(){
		
//		Course course1 = new Course(23, "Angular");		
//		Course course2 = new Course(24, "React");	
//		List<Course> courses = new ArrayList<>();
//		courses.add(course1); courses.add(course2);
		return repo.findAll();
//		return courses;
	}
	
	@RequestMapping(path="/courses", method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course){
		repo.save(course);
	}

}

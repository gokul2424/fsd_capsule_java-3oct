package com.cts.ctsdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ctsdemo.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}

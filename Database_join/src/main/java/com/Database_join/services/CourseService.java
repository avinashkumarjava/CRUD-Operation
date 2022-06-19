package com.Database_join.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Database_join.repository.Repository_course;
import com.Database_join.secondtable.Course;

@Service
public class CourseService {
@Autowired
Repository_course rec;
public List<Course> listAll() {
    return rec.findAll();
}

public Course save(Course course) {
    return rec.save(course);
}

}

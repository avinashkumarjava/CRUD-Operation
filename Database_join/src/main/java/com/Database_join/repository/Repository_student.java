package com.Database_join.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Database_join.fristtable.Student;
public interface Repository_student extends JpaRepository<Student, Integer>  {
@Query("SELECT * FROM student  a LEFT JOIN course b ON  a.course_id = b.course_id" )
public List<Student> innerjoin();

}

package com.Database_join.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Database_join.secondtable.Course;
public interface Repository_course extends JpaRepository<Course, Integer>  {
 

}

package com.Database_join.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Database_join.fristtable.Student;
import com.Database_join.secondtable.Course;
import com.Database_join.services.CourseService;
import com.Database_join.services.studentService;

@RestController

public class Controller {
	@Autowired
	studentService STS;

	@RequestMapping("/student")
	public Map<String, Object> list() {
		List<Course> listCourse = CTS.listAll();
		List<Student> listStu = STS.listAll();
		Map<String, Object> map = new HashMap<>();
		map.put("cource_list", listCourse);
		map.put("student_list", listStu);
		return map;

	}

	@Autowired
	CourseService CTS;

	@RequestMapping("/abc")
	
		public ResponseEntity<List<Student>>innerjoin() {
return new ResponseEntity<List<Student>>(STS.innerjoin(), HttpStatus.OK);	

	}

}

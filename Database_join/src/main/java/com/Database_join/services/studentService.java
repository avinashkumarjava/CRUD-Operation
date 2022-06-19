package com.Database_join.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Database_join.fristtable.Student;
import com.Database_join.repository.Repository_student;
@Service
public class studentService {
@Autowired
Repository_student res;
public List<Student> listAll() {
    return res.findAll();
}

public Student save(Student student) {
    return res.save(student);
}
public List<Student> innerjoin() {
	List<Student> list = res.innerjoin();
	list.forEach(s -> System.out.println(s));
	return list;
}
}

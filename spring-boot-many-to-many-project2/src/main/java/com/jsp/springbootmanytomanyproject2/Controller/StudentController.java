package com.jsp.springbootmanytomanyproject2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootmanytomanyproject2.Dto.Student;
import com.jsp.springbootmanytomanyproject2.Dto.Teacher;
import com.jsp.springbootmanytomanyproject2.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentSrevice;
	
//	@Autowired
//	private TeacherRepository teacherRepository;

	/*
	 * save method
	 * 
	 */
	
	
	
	
	@PostMapping(value = "/saveStudentDetails")
	public List<Object> saveStudentteachers(@RequestBody List<Student> student){
		List<Student> students=studentSrevice.saveStudentTeachers(student);
		List<Object> objects=new ArrayList<Object>();
		for (Student student2 : students) {
			objects.add(student2);
			objects.add(student2.getTeachers());
		}
		return objects;
	}
	
	
	/*
	 * 
	 * get Student data by teacher id
	 */
	@GetMapping(value = "/getStudents/{teacherId}")
	public Teacher getStudentDataByTeacherId(@PathVariable int teacherId) {
		return studentSrevice.getStudentDataByTeacherId(teacherId);
	}
	
	
	
	/*
	 * delete
	 */
	
	@DeleteMapping(value = "/deleteStudents/{studentId}")
	public void deleteStudentById(@PathVariable int studentId) {
	
		studentSrevice.deleteStudentById(studentId);
		
	}
}


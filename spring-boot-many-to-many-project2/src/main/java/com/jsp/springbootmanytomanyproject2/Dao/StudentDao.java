package com.jsp.springbootmanytomanyproject2.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootmanytomanyproject2.Dto.Student;
import com.jsp.springbootmanytomanyproject2.Dto.Teacher;
import com.jsp.springbootmanytomanyproject2.Repository.StudentRepository;
import com.jsp.springbootmanytomanyproject2.Repository.TeacherRepository;

@Repository
public class StudentDao {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	
	/*
	 * save method 
	 */
	public List<Student> saveStudentTeacher(List<Student> student) {
		return studentRepository.saveAll(student);
	}
	
	
	/*
	 * getStudent data  by teacher id
	 */
	
	public Teacher getStudentDataByTeacherId(int teacherId) {
	return teacherRepository.findByTeacherId(teacherId);
		
	}
	
	
	
	/*
	 * delete student by id
	 */
	
	public void deleteStudentById(int studentId) {
		Optional<Student> optional = studentRepository.findById(studentId);
		
		if(optional.isPresent()) {
			
			Student student = optional.get();
			studentRepository.delete(student);
			
			}
	}
}

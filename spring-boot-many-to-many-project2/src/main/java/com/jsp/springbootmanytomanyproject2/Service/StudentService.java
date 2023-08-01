package com.jsp.springbootmanytomanyproject2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootmanytomanyproject2.Dao.StudentDao;
import com.jsp.springbootmanytomanyproject2.Dto.Student;
import com.jsp.springbootmanytomanyproject2.Dto.Teacher;

@Service
public class StudentService {

	
	@Autowired
	private StudentDao studentDao;
	
//	@Autowired
//	private TeacherRepository teacherRepository;
	
	public List<Student> saveStudentTeachers(List<Student> student) {
		return studentDao.saveStudentTeacher(student);
	}
	
	/*
	 * getStudent by teacher id
	 */
	
	public Teacher getStudentDataByTeacherId(int teacherId) {
		return studentDao.getStudentDataByTeacherId(teacherId);
	}
	
	
	
	/*
	 * delete student by id
	 */
	
	public void deleteStudentById( int studentId) {
		  studentDao.deleteStudentById(studentId);
}
}
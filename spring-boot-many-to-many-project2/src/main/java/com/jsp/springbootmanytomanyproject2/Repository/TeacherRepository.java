package com.jsp.springbootmanytomanyproject2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootmanytomanyproject2.Dto.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	public Teacher findByTeacherId(int teacher);

}

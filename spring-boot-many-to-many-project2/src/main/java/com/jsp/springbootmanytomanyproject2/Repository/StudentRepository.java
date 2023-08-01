package com.jsp.springbootmanytomanyproject2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootmanytomanyproject2.Dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

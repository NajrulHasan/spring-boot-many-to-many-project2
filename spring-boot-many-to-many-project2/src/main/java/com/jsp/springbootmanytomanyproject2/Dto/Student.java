package com.jsp.springbootmanytomanyproject2.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	 private int studentId;
	 private String studentName;
	 private String studentEmail;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "students_teachers",
	 joinColumns = {
			 @JoinColumn(name = "studentId")
	 },
	 inverseJoinColumns = { @JoinColumn(name ="teacherId")})
	 @JsonBackReference 
	 @JsonIgnore
	 private List<Teacher> teachers; 
	 
}

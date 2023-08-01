package com.jsp.springbootmanytomanyproject2.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Teacher {

	  @Id
	  private int teacherId;
	  private String teacherName;
	  private String teacherEmail;
	  
	  @ManyToMany(mappedBy = "teachers", cascade = CascadeType.ALL)
	 @JsonManagedReference
	 @JsonIgnore
	  private List<Student> students;
	  
}

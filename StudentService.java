package com.service;

import java.util.List;

import com.model.Student;



public interface StudentService {
	
	boolean addStudent(Student student);
	
	boolean deleteStudent(int id);
	
	boolean updateStudent(Student student);
	
	
	
	
	List<Student>  getAllstudents();
	
	List<Student>  searchStudent(String data);

	Student getStudentById(int id);

	boolean submitStudent(Student singup);
	
	
	boolean loginStudent(String userName, String password);	

	
	
	

}

package com.example.StudentDb.service;

import java.util.List;

import com.example.StudentDb.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student getById(Long id);
	public List<Student> getAllStds();
	public Student updateDetails(Student student,Long id);
	public String deleteStudent(Long id);

}

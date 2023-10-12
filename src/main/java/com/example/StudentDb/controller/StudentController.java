package com.example.StudentDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDb.entity.Student;
import com.example.StudentDb.repo.StudentRepo;
import com.example.StudentDb.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/getstudent/{id}")
	public Student getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@GetMapping("/fetchAll")
	public List<Student> fetchAllStds() {
		return service.getAllStds();
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudentDetails(@RequestBody Student student,@PathVariable Long id) {
		return service.updateDetails(student,id);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable Long id) {
		 return service.deleteStudent(id);
	}
	
	
}

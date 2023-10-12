package com.example.StudentDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDb.entity.Course;
import com.example.StudentDb.entity.Student;
import com.example.StudentDb.repo.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		return repo.save(student);
	}

	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
				
	}

	@Override
	public List<Student> getAllStds() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	
	public Student updateDetails(Student student,Long id) {
		// TODO Auto-generated method stub
		Student updateStudent=repo.findById(student.getId()).orElse(null);
		if(updateStudent!=null) {
			updateStudent.setsName(student.getsName());
			updateStudent.setsEmail(student.getsEmail());
			
			repo.save(updateStudent);
			return updateStudent;
		}
		return null;
	}

	@Override
	public String deleteStudent(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted id is " +id;		
		
	}

}

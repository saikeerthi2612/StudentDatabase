package com.example.StudentDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDb.entity.Course;
import com.example.StudentDb.entity.Student;
import com.example.StudentDb.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courserepo;


	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courserepo.save(course);
	}

	@Override
	public Course getById(Long cId) {
		// TODO Auto-generated method stub
		return courserepo.findById(cId).get();
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courserepo.findAll();
	}

	@Override
	public Course updateCourseDetails(Course course,Long cId) {
		// TODO Auto-generated method stub
		Course updateCourse=courserepo.findById(course.getcId()).orElse(null);
		if(updateCourse!=null) {
			updateCourse.setCourseName(course.getCourseName());
			updateCourse.setDuration(course.getDuration());
			updateCourse.setAmount(course.getAmount());
			
			courserepo.save(updateCourse);
			return updateCourse;
		}
		return null;
	}

	@Override
	public String deleteCourse(Long cId) {
		// TODO Auto-generated method stub
		courserepo.deleteById(cId);
		return "deleted courseid is "+cId;

	}


}

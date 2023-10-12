package com.example.StudentDb.service;

import java.util.List;

import com.example.StudentDb.entity.Course;

public interface CourseService {
	public Course saveCourse(Course course);
	public Course getById(Long cId);
	public List<Course> getAllCourses();
	public Course updateCourseDetails(Course course,Long cId);
	public String deleteCourse(Long cId);

}

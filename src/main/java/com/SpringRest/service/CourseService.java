package com.SpringRest.service;

import java.util.List;

import com.SpringRest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long id);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);

	public void deleteCourse(long id);

}

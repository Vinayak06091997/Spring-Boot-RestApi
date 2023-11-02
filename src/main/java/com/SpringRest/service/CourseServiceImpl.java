package com.SpringRest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.Dao.CourseDao;
import com.SpringRest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	
	@Autowired
	CourseDao courseDao;


//	public CourseServiceImpl() {
//		
////		list=new ArrayList<>();
////		list.add(new Course(145,"Java Complete","This is java Subject"));
////		list.add(new Course(146,"Spring Boot Complete","This is Spring Boot Subject"));
//	}



	public List<Course> getCourses() {
	
		return courseDao.findAll();
//		return list;
	}

	public Course getCourse(long id) {
//		Course c=null;
//		for(Course course:list) 
//		{
//			if(course.getId()==id)
//			{
//				c=course;
//			}
//		}
//		return c;
		
		return courseDao.findById(id).get();
		
	}



	@Override
	public Course addCourse(Course course) {
		
//		list.add(course);
//		return course;
		
		return courseDao.save(course);
	}



	@Override
	public void deleteCourse(long id) {
//		Course c=null;
//		for(Course course:list) 
//		{
//			if(course.getId()==id)
//			{
//				c=course;
//			}
//		}
//		
//		list.remove(c);
//		return c;
		Course c=courseDao.findById(id).get();
		 courseDao.delete(c);
		
		
	}



	@Override
	public Course updateCourse(Course course) {
//		long	id=course.getId();
//		Course c=null;
//		for(Course courses:list) 
//		{
//			if(courses.getId()==id)
//			{
//				c=courses;
//			}
//		}
//		
//		list.remove(c);
//		list.add(course);
//		return c;
		return courseDao.save(course);
		
	}



	

}

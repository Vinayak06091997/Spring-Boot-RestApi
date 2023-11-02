package com.SpringRest.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.SpringRest.entities.Course;
import com.SpringRest.service.CourseService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins="http://localhost:3000")
public class RestController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Wellcome to Home vinayak";
	}
	
	@GetMapping("/courses")
	
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@GetMapping("/course/{id}")

	public Course getCourse(@PathVariable("id") long id)
	{
		return courseService.getCourse(id);
	}
	
	@PostMapping(path="/course")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return courseService.updateCourse(course);
	}
	
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") long id)
	{
		try {
			 this.courseService.deleteCourse(id);
			 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e){
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}







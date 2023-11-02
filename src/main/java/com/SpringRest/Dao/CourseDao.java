package com.SpringRest.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.entities.Course;


public interface CourseDao extends JpaRepository<Course,Long> {

}

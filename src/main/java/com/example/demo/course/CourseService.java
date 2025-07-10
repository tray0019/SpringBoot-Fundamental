/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Business logic class
 */

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*
	 * Find all Topic
	 */
	public List<Course> getAllTopic(){
		return courseRepository.findAll();
	}
	
	/*
	 * Get topic by id
	 */
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
	
	
	
	
	
}

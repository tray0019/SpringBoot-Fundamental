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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

/*
 * RESTful API controller class in SpringBoot
 */

@RestController 
@RequestMapping("/topics/{topicId}/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping
	public List<Course> getAllCourses(@PathVariable String topicId){
		return courseService.getAllCourses(topicId);
	}
	
	@GetMapping("/{courseId}")
	public Optional<Course> getCourses(@PathVariable("courseId") String id){
		return courseService.getCourse(id);
	}
	
	@PostMapping
	public void addCourses(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "",""));
		courseService.addCourse(course);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody Course course, @PathVariable String id) {
		courseService.updateCourse(id, course);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourses(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
}


/*
 * Spring Boot actions:
 * - Call my method
 * - Automatically convert the returned Java object to JSON
 * - Send that JSON back to the client(browser, Postman etc)
 */

/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/*
 * RESTful API controller class in SpringBoot
 */

@RestController 
public class TopicController {

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("JavaScript", "JS", "JS Description")
			));
			


}


/*
 * 
 * Spring Boot actions:
 * - Call my method
 * - Automatically convert the returned Java object to JSON
 * - Send that JSON back to the client(browser, Postman etc)
 */

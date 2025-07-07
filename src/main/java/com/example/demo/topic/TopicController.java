/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * RESTful API controller class in SpringBoot
 */

@RestController 
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopic(){
		return topicService.getAllTopic();
	}
			
	@GetMapping("/topics/{testID}")
	public Topic getTopic(@PathVariable("testID") String id){
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{id}")
	public void update(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}


}


/*
 * 
 * Spring Boot actions:
 * - Call my method
 * - Automatically convert the returned Java object to JSON
 * - Send that JSON back to the client(browser, Postman etc)
 */

/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.topic;

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
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Description"),
			new Topic("Java","Core Java","Java Description"),
			new Topic("JavaScript","JS","JavaScript Description")
			));
	
	/*
	 * Find all Topic
	 */
	public List<Topic> getAllTopic(){
		return topicRepository.findAll();
	}
	
	/*
	 * Get topic by id
	 */
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
	
	
	
	
	
}

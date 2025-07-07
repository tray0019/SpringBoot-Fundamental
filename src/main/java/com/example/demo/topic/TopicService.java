/**
 * @author Rustom Trayvilla
 * @since July 5, 2025
 * @version 1.0
 */
package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * Business logic class
 */

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Description"),
			new Topic("Java","Core Java","Java Description"),
			new Topic("JavaScript","JS","JS Description")
			));
	
	public List<Topic> getAllTopic(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();//lambda expression 
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
	
	
	
	
	
	
}

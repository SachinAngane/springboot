package com.sachin.springbootstarter.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachin on 05-04-2020.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
       return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {

        System.out.println("topic added :: " + topic.getId());
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }

    public void updateTopic(Topic topic) {
        topicRepository.save(topic);
    }

}

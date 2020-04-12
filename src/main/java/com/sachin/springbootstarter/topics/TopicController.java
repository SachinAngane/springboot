package com.sachin.springbootstarter.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachin on 05-04-2020.
 */

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService service;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        System.out.println("Returning all topics....");
        return service.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {

        System.out.println("Returning one topic....");
        return service.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        System.out.println("New topic is being added :: " + topic.getId());
        service.addTopic(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        System.out.println("Deleting one topic :: " + id);
        service.deleteTopic(id);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        System.out.println("New topic is being updated :: " + topic.getId());
        service.updateTopic(topic);
    }
}

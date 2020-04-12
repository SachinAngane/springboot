package com.sachin.springbootstarter.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachin on 05-04-2020.
 */

@RestController
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

    @RequestMapping(method=RequestMethod.POST, value="/topics" )
    public void addTopic(@RequestBody Topic topic) {

        System.out.println("New topic is being added :: " + topic.getId());
        service.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        System.out.println("Deleting one topic :: " + id);
        service.deleteTopic(id);
    }
}

package com.sachin.springbootstarter.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachin on 05-04-2020.
 */

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<Topic>
    (Arrays.asList(
            new Topic("spring", "spring framework", "spring framework description"),
            new Topic("java", "java framework", "java framework description"),
            new Topic("javascript", "javascript framework", "javascript framework description")));

    public List<Topic> getAllTopics(){
        return this.topics;
    }

    public Topic getTopic(String id) {
        Topic topic = null;
        for(Topic t : topics) {
            if(t.getId().equalsIgnoreCase(id)) {
                topic = t;
            }
        }
        return topic;
    }

    public void addTopic(Topic topic) {

        System.out.println("topic added :: " + topic.getId());
        topics.add(topic);
    }

    public void deleteTopic(String id) {
        for(Topic topic : topics) {
            if(topic.getId().equalsIgnoreCase(id)) {
                topics.remove(id);
            }
        }
    }

}

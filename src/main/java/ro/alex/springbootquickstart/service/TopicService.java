package ro.alex.springbootquickstart.service;

import org.springframework.stereotype.Service;
import ro.alex.springbootquickstart.domain.Topic;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "SpringFramework Description"),
            new Topic("java", "Core Java", "CoreJava Description"),
            new Topic("javascript", "Java Script", "Java Script Description")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}

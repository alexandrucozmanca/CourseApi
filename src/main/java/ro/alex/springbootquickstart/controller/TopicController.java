package ro.alex.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.alex.springbootquickstart.domain.Topic;
import ro.alex.springbootquickstart.service.TopicService;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "SpringFramework Description"),
                new Topic("java", "Core Java", "CoreJava Description"),
                new Topic("javascript", "Java Script", "Java Script Description")
        );
    }

}

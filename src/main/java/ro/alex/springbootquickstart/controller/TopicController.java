package ro.alex.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.alex.springbootquickstart.domain.Topic;
import ro.alex.springbootquickstart.service.TopicService;


import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{topicId}")
    public Topic getTopic(@PathVariable String topicId){
        return  topicService.getTopic(topicId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId){
        topicService.updateTopic(topic, topicId);
    }

   @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}")
   public void deleteTopic(@PathVariable String topicId){
       topicService.deleteTopic(topicId);
   }

}

package ro.alex.springbootquickstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.alex.springbootquickstart.domain.Topic;
import ro.alex.springbootquickstart.repositories.TopicRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String topicId){
        return topicRepository.findById(topicId).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String topicId) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String topicId) {
        topicRepository.deleteById(topicId);
    }

}

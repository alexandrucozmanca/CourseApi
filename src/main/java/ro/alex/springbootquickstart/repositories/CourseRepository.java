package ro.alex.springbootquickstart.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.springbootquickstart.domain.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository <Course, String>{

     public List<Course> findByTopicId(String topicId);
}

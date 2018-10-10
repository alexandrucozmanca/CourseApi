package ro.alex.springbootquickstart.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.springbootquickstart.domain.Course;

public interface CourseRepository extends CrudRepository <Course, String>{

}

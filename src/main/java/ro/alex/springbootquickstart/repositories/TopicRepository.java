package ro.alex.springbootquickstart.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.springbootquickstart.domain.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
}

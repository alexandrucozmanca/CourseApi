package ro.alex.springbootquickstart.repositories;

import org.springframework.data.repository.CrudRepository;
import ro.alex.springbootquickstart.domain.Lesson;

import java.util.List;

public interface LessonRepository  extends CrudRepository<Lesson, String> {

    public List<Lesson> findByCourseId(String courseId);
}

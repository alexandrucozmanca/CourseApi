package ro.alex.springbootquickstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.alex.springbootquickstart.domain.Lesson;
import ro.alex.springbootquickstart.repositories.LessonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
                .forEach(lessons::add);
        return lessons;
    }

    public Lesson getLesson(String lessonId) { return lessonRepository.findOne(lessonId);
    }

    public void addLesson(Lesson lesson) { lessonRepository.save(lesson);}

    public void updateLesson(Lesson lesson) {lessonRepository.save(lesson);}

    public void deleteLesson(String lessonId) {lessonRepository.delete(lessonId);}

}

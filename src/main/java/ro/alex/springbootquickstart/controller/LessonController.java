package ro.alex.springbootquickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.alex.springbootquickstart.domain.Course;
import ro.alex.springbootquickstart.service.LessonService;
import ro.alex.springbootquickstart.domain.Lesson;

import java.util.List;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @RequestMapping("/topics/{topicId}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String courseId) {
        return lessonService.getAllLessons(courseId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}/lessons/{lessonsId}")
    public Lesson getLesson(@PathVariable String lessonId){
        return lessonService.getLesson(lessonId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@RequestBody Lesson lesson,@PathVariable String topicId, @PathVariable String courseId){
        lesson.setCourse(new Course(courseId, "", "", topicId));
        lessonService.addLesson(lesson);
    }

    @RequestMapping(method =  RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
    public void updateLesson(@RequestBody Lesson lesson,@PathVariable String topicId, @PathVariable String courseId, @PathVariable String lessonId){
        lesson.setCourse(new Course(courseId, "", "", topicId));
        lessonService.addLesson(lesson);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
    public void deleteLesson(@PathVariable String lessonId){
        lessonService.deleteLesson(lessonId);
    }

}

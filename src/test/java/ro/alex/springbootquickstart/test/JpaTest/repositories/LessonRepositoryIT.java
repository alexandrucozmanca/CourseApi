package ro.alex.springbootquickstart.test.JpaTest.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ro.alex.springbootquickstart.domain.Lesson;
import ro.alex.springbootquickstart.repositories.LessonRepository;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LessonRepositoryIT {

    @Autowired
    LessonRepository lessonRepository;

    @Before
    public void setUp() throws  Exception{
    }

    @Test
    public void findByCourseId() throws Exception{

       List<Lesson> lessonList = lessonRepository.findByCourseId("id");

       assertEquals(lessonRepository.findByCourseId("id"), lessonList);
    }
}

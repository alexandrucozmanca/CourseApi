package ro.alex.springbootquickstart.test.JpaTest.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ro.alex.springbootquickstart.domain.Course;
import ro.alex.springbootquickstart.domain.Lesson;
import ro.alex.springbootquickstart.repositories.CourseRepository;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CourseRepositoryIT {

    @Autowired
    CourseRepository courseRepository;

    @Before
    public void setUp() throws  Exception{
    }

    @Test
    public void findByCourseId() throws Exception{

       List<Course> courseList = courseRepository.findByTopicId("id");

       assertEquals(courseRepository.findByTopicId("id"), courseList);
    }
}

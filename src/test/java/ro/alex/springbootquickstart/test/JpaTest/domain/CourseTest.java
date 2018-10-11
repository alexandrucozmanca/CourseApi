package ro.alex.springbootquickstart.test.JpaTest.domain;

import org.junit.Before;
import org.junit.Test;
import ro.alex.springbootquickstart.domain.Course;
import ro.alex.springbootquickstart.domain.Topic;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    private Course course;

    @Before
    public void setUp() {
        course = new Course();}

    @Test
    public void getId(){
        String idValue = "id Value";

        course.setId(idValue);

        assertEquals(idValue, course.getId());
    }

    @Test
    public void getDescription(){
        String descriptionValue = "description Value";

        course.setDescription(descriptionValue);

        assertEquals(descriptionValue, course.getDescription());
    }

    @Test
    public void getName(){
        String nameValue = "name Value";

        course.setName(nameValue);

        assertEquals(nameValue, course.getName());
    }

    @Test
    public void getTopic(){
        Topic topic = new Topic();

        course.setTopic(topic);

        assertEquals(topic, course.getTopic());

    }
}

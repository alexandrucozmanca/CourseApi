package ro.alex.springbootquickstart.test.JpaTest.domain;

import org.junit.Before;
import org.junit.Test;
import ro.alex.springbootquickstart.domain.Course;
import ro.alex.springbootquickstart.domain.Lesson;

import static org.junit.Assert.assertEquals;

public class LessonTest {

    private Lesson lesson;

    @Before
    public void setUp() {
        lesson = new Lesson();}

    @Test
    public void getId(){
        String idValue = "id Value";

        lesson.setId(idValue);

        assertEquals(idValue, lesson.getId());
    }

    @Test
    public void getDescription(){
        String descriptionValue = "description Value";

        lesson.setDescription(descriptionValue);

        assertEquals(descriptionValue, lesson.getDescription());
    }

    @Test
    public void getName(){
        String nameValue = "name Value";

        lesson.setName(nameValue);

        assertEquals(nameValue, lesson.getName());
    }

    @Test
    public void getCourse(){
        Course course = new Course();

        lesson.setCourse(course);

        assertEquals(course, lesson.getCourse());

    }
}

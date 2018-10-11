package ro.alex.springbootquickstart.test.JpaTest.domain;

import org.junit.Before;
import org.junit.Test;
import ro.alex.springbootquickstart.domain.Topic;

import static org.junit.Assert.assertEquals;

public class TopicTest {

    private Topic topic;

    @Before
    public void setUp() {topic = new Topic();}

    @Test
    public void getId(){
        String idValue = "id Value";

        topic.setId(idValue);

        assertEquals(idValue, topic.getId());
    }

    @Test
    public void getDescription(){
        String descriptionValue = "description Value";

        topic.setDescription(descriptionValue);

        assertEquals(descriptionValue, topic.getDescription());
    }

    @Test
    public void getName(){
        String nameValue = "name Value";

        topic.setName(nameValue);

        assertEquals(nameValue, topic.getName());
    }
}

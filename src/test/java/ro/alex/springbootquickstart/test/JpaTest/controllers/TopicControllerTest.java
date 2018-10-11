package ro.alex.springbootquickstart.test.JpaTest.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import ro.alex.springbootquickstart.controller.TopicController;
import ro.alex.springbootquickstart.service.TopicService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TopicControllerTest {

    @Mock
    TopicService topicService;
    TopicController topicController;


    @Before
    public void SetUp() throws Exception{
        MockitoAnnotations.initMocks(this);

        topicController = new TopicController();
    }

    @Test
    public void TestMockMVC() throws Exception{
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(topicService).build();

        mockMvc.perform(get("/topics")).andExpect(status().isOk());

    }

}

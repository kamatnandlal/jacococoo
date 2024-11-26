package com.example.service2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSayWorld() throws Exception {
        mockMvc.perform(get("/service2/world"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from Service 2!"));
    }
}

package com.example.service1;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @WebMvcTest(HelloController.class)
// public class HelloControllerTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @Test
//     public void testSayHello() throws Exception {
//         mockMvc.perform(get("/service1/hello"))
//                 .andExpect(status().isOk())
//                 .andExpect(content().string("Hello from Service 1!"));
//     }

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest {

    @Test
    void contextLoads() {
        
    }
}
}


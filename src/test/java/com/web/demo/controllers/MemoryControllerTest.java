package com.web.demo.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(MemoryController.class)
class MemoryControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Mock
    private MemoryController memoryController;

    @Test
    void getString() throws Exception {
        mockMvc.perform(get("/api/v1/memories"))
                .andExpect(status().isOk());
    }
}
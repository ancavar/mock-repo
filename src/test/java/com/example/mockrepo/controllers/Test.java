package com.example.mockrepo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class Test {

    @Autowired
    MockMvc mockMvc;

    @org.junit.jupiter.api.Test
    @WithMockUser
    void test() throws  Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/admin")).andDo(print()).andExpect(status().isOk());
    }
}

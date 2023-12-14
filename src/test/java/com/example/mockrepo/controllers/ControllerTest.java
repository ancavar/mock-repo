package com.example.mockrepo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

        @Autowired
        MockMvc mockMvc;

        @Test
        @WithMockUser(username = "admin",authorities = { "ROLE_ADMIN" })
        void testAdminEndpoint_AdminRole() throws Exception{
                mockMvc.perform(get("/admin")).
                 andExpectAll(
                        status().isOk(),
                        content().string("admin"));
        }

        @Test
        @WithMockUser
        void testAdminEndpoint_NoAdminRole() throws Exception{
                mockMvc.perform(get("/admin")).
                 andExpect(status().isForbidden());
        }

        @Test
        @WithMockUser(authorities = { "ROLE_USER" })
        void testUserEndpoint_Authenticated() throws Exception{
                mockMvc.perform(get("/user")).
                 andExpectAll(
                        status().isOk(),
                        content().string("Hello"));
        }

        @Test
        @WithAnonymousUser
        void testUserEndpoint_Unauthenticated() throws Exception{
                mockMvc.perform(get("/user")).
                 andExpect(status().isUnauthorized());
        }

        @Test
        @WithAnonymousUser
        void testAllEndpoint() throws Exception{
                mockMvc.perform(get("/all")).
                 andExpectAll(
                        status().isOk(),
                        content().string("you should log in, NOW!"));
        }
}

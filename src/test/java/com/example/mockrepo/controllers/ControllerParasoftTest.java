package com.example.mockrepo.controllers;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import com.example.mockrepo.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.Authentication;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;


/**
 * Parasoft Jtest UTA: Test class for Controller
 *
 * @author фвьшт
 * @see Controller
 */
@WebMvcTest(Controller.class)
@DirtiesContext // Parasoft Jtest UTA: Reset context for each test run
public class ControllerParasoftTest {

    // Parasoft Jtest UTA: Spring MVC test support class
    @Autowired
    MockMvc mockMvc;

    // Parasoft Jtest UTA: Spring security authentication
    Authentication authentication;

    // Parasoft Jtest UTA: Dependency generated for autowired field "service" in Controller
    @MockBean
    Service service;

    /**
     * Parasoft Jtest UTA: Test for admin()
     *
     * @author фвьшт
     * @see Controller#admin()
     */
    @Test
    public void testAdmin() throws Throwable {
        // When
        ResultActions actions = mockMvc.perform(get("/admin").principal(authentication));


        // Then
        // actions.andExpect(status().isOk());
        // actions.andExpect(header().string("", ""));
        // actions.andExpect(view().name(""));
    }

    /**
     * Parasoft Jtest UTA: Test for user()
     *
     * @author фвьшт
     * @see Controller#user()
     */
    @Test
    public void testUser() throws Throwable {
        // When
        ResultActions actions = mockMvc.perform(get("/user"));


        // Then
        // actions.andExpect(status().isOk());
        // actions.andExpect(header().string("", ""));
        // actions.andExpect(view().name(""));
    }

    /**
     * Parasoft Jtest UTA: Test for all()
     *
     * @author фвьшт
     * @see Controller#all()
     */
    @Test
    public void testAll() throws Throwable {
        // When
        ResultActions actions = mockMvc.perform(get("/all"));


        // Then
        // actions.andExpect(status().isOk());
        // actions.andExpect(header().string("", ""));
        // actions.andExpect(view().name(""));
    }
}
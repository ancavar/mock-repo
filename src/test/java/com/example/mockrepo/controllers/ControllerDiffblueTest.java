package com.example.mockrepo.controllers;

import com.example.mockrepo.service.Service;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {Controller.class, Service.class})
@ExtendWith(SpringExtension.class)
class ControllerDiffblueTest {
    @Autowired
    private Controller controller;

    /**
     * Method under test: {@link Controller#admin()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdmin() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   jakarta.servlet.ServletException: Request processing failed: java.lang.NullPointerException: Cannot invoke "org.springframework.security.core.Authentication.getName()" because the return value of "org.springframework.security.core.context.SecurityContext.getAuthentication()" is null
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.security.core.Authentication.getName()" because the return value of "org.springframework.security.core.context.SecurityContext.getAuthentication()" is null
        //       at com.example.mockrepo.controllers.Controller.admin(Controller.java:17)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   See https://diff.blue/R013 to resolve this issue.

        (new Controller()).admin();
    }

    /**
     * Method under test: {@link Controller#all()}
     */
    @Test
    void testAll() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/all");
        MockMvcBuilders.standaloneSetup(controller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("you should log in, NOW!"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("you should log in, NOW!"));
    }

    /**
     * Method under test: {@link Controller#all()}
     */
    @Test
    void testAll2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/all");
        requestBuilder.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(controller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("you should log in, NOW!"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("you should log in, NOW!"));
    }

    /**
     * Method under test: {@link Controller#user()}
     */
    @Test
    void testUser() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MockMvcBuilders.standaloneSetup(controller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("Hello"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("Hello"));
    }

    /**
     * Method under test: {@link Controller#user()}
     */
    @Test
    void testUser2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        requestBuilder.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(controller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("Hello"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("Hello"));
    }
}

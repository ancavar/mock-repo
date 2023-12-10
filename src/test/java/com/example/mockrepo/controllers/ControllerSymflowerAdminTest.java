package com.example.mockrepo.controllers;

import com.example.mockrepo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(Controller.class)
public class ControllerSymflowerAdminTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private Service service;

	@Test
	public void admin() throws Exception {
		this.mockMvc.perform(get("/admin"))
			.andExpect(status().isOk())
			.andExpect(view().name(""))
			.andExpect(content().string(""));
	}
}

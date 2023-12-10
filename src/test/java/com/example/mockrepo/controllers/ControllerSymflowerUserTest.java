package com.example.mockrepo.controllers;

import com.example.mockrepo.service.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ControllerSymflowerUserTest {
	@Test
	public void user1() {
		Controller c = new Controller();
		// assertThrows(java.lang.NullPointerException.class, () -> {
		c.user();
		// });
	}

	@Test
	public void user2() {
		Controller c = new Controller();
		c.service = new Service();
		String expected = "Hello";
		String actual = c.user();

		assertEquals(expected, actual);
	}
}

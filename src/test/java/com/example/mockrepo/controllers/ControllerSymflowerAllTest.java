package com.example.mockrepo.controllers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ControllerSymflowerAllTest {
	@Test
	public void all1() {
		Controller c = new Controller();
		String expected = "you should log in, NOW!";
		String actual = c.all();

		assertEquals(expected, actual);
	}
}

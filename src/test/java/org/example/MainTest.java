package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void sum() {
		// given
		int number = 3;
		int expected = 4;
		// when
		int actual = Main.sum(number);
		// then
		assertEquals(expected, actual);
	}
}

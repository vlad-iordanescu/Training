package com.crispico.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplierTest {

	@Test
	public void Test() {
		Multiplier x = new Multiplier();
		for (int i = 0; i < 999; i++) {
			for (int j = 0; j < 999; j++) {
				assertEquals("Equals", i * j, x.multiply(i, j));
			}
		}
	}

	@Test(expected = Exception.class)
	public void Test_except() {
		Multiplier x = new Multiplier();
		for (int i = 1000; i < 1999; i++) {
			for (int j = 1000; j < 1999; j++) {
				assertEquals("Equals", i * j, x.multiply(i, j));
			}
		}
	}

}

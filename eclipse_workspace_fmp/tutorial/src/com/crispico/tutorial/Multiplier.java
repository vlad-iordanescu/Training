package com.crispico.tutorial;

public class Multiplier {
	public int multiply(int x, int y) {
		if(x>999 || y>999) {
			throw new IllegalArgumentException("X and Y should be less than 1000");
		}
	return x*y;}
}

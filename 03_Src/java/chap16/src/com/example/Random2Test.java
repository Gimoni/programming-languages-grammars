package com.example;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Random2Test {
	
	@Test
	void nextInt() {
		Random r = new Random();
		System.out.println(r.nextInt());
	}
	
}

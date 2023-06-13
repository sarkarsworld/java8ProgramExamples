package com.simplesolutions.functional;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alok", "Arun");
		
		names.stream()
		.forEach(System.out::println);

	}

}

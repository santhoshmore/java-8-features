package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		Arrays.asList("john", "rayban", "johnson","mitty bom","raymond", "gap");
		List<String> numbers = Arrays.asList("1","2","3","4","5","6","7","8");
		List<Integer> even = numbers.stream()
			   .map(s -> Integer.valueOf(s))
			   .filter(number -> number %2 ==0)
			   .collect(Collectors.toList());
		
		even.forEach(System.out::print);
			
	}
}

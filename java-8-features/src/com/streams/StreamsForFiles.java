package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsForFiles {
	/*
	 Java 8 added many methods in java.io and java.nio.io packages to support I/O operations using streams.	
	 */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			Stream<String> lines = Files.lines(Paths.get("C:\\Users\\smore\\eclipse-workspace\\java-8-features\\src\\com\\streams\\sampleFile"));
		List<String> line3toUpperCase= lines.filter(line->line.contains("line3"))
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		
		line3toUpperCase.forEach(System.out::println);
		Files.newDirectoryStream(Paths.get(".")).forEach(System.out::println);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
}

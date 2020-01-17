package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,4,55,52,90,90);
		ArrayList<Integer> ar= (ArrayList) list.stream().filter(number -> number >10).limit(3).collect(Collectors.toList());
		System.out.println(ar);
		
		/****** Stream from values ******/
		
		Stream<Integer> stream = Stream.of(1,2,3,4,21,33,9);
		stream.forEach(p->System.out.print(p + " "));
		System.out.println();// stream with array
		Stream<Integer> strm = Stream.of(new Integer[] {33,98,88,33,12,3,4,4});
		strm.forEach(p->System.out.print(p +" "));
		System.out.println(); // empty stream
		Stream<Integer> streamEmpty = Stream.empty();
		System.out.println(streamEmpty);
		
		System.out.println("Iterate stream...");
		Stream<Integer> infiniteStream = Stream.iterate(0, i->i+2);
		List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::print);
		//System.out.print(iterateStream);
		
		System.out.println("\n Random number...");
		Stream<Integer> generateStream = Stream.generate(new Random()::nextInt);
		List<Integer> collectRandom = generateStream.limit(10).collect(Collectors.toList());
		collectRandom.forEach(System.out::println);
		
	}
}

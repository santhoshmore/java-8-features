package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamFromCollection {
		static int x =0;
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(1,3,5,33);
			boolean status = list.stream().anyMatch(n -> n % 2 == 0);
			System.out.println(status);
			System.out.println("without lambda expression...");
			list.stream().filter(new Predicate<Integer>() {
				@Override
				public boolean test(Integer t) {
					// TODO Auto-generated method stub
					return t % 2 == 0;
				}
			}).forEach(new Consumer<Integer>() {
				@Override
				public void accept(Integer t) {
					x = x + t;
					System.out.println(t);
				}
			});
				
		}
}

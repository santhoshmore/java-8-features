package com.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Class {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			myList.add(i);
		}
		myList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("Iterator value: "+ t);
			}
		});
	}
}

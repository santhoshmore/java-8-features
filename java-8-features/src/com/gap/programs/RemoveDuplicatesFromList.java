package com.gap.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		for(int j=0;j<10;j++) {
			list.add(j);
		}
		System.out.println(list);
		///////////// Approach 1 /////////////
		/*
		 * Set<Integer> set = new HashSet<>(); set.addAll(list);
		 * System.out.println(set);
		 */
		
		////////// Approach 2 /////////////
		/*
		 * List<Integer> newList = new ArrayList<Integer>();
		 * for(Integer i : list) { if(!newList.contains(i)) { newList.add(i); } }
		 * System.out.println(newList);
		 */
	}
}

package com.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		List<Developer> devList = getDevelopers();
		for(Developer dev: devList) {
			System.out.println(dev);
		}
		System.out.println("after sort");
		//devList.sort((Developer d1, Developer d2)-> d1.getAge()-d2.getAge());
		devList.sort((Developer d1, Developer d2)-> d1.getName().compareTo(d2.getName()));
		devList.forEach((dev1)->System.out.println(dev1));
	}
	
	private static List<Developer> getDevelopers(){
		List<Developer> newList = new ArrayList<Developer>();
		newList.add(new Developer("micheal", new BigDecimal(50000), 26));
		newList.add(new Developer("john", new BigDecimal(100000), 24));
		newList.add(new Developer("ketty", new BigDecimal(23244),30));
		return newList;
	}
}

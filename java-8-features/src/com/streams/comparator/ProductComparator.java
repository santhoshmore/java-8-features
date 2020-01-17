package com.streams.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductComparator {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "HP laptop", 2500));
		list.add(new Product(2, "Lenovo laptop", 2600));
		list.add(new Product(3, "Dell laptop", 3000));
		list.add(new Product(4, "Asus laptop", 1500));
		list.add(new Product(5, "Samsung laptop", 3200));
		list.add(new Product(6, "Apple laptop", 5000));
		
		
		List<Float> result  = list.stream()
				                  .filter(p->p.price>=2000)
				                  .map(p->p.price)
				                  .distinct()
				                  .limit(5)
				                  .collect(Collectors.toList());
		 
		System.out.println(result);
	}
}

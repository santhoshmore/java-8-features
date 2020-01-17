package com.gap.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {
	
	/*
	 * public static <T> List<T> convertArrayToList(T array[]){ return
	 * Arrays.stream(array).collect(Collectors.toList()); }
	 */
	 public static <T> List<T> convertArrayToList(T array[]) 
	    { 
	        // create a list from the Array 
	        return Arrays 
	            .stream(array) 
	            .collect(Collectors.toList()); 
	    } 
	/*
	 * public static void main(String[] args) { //int []arr = {3,4,2,5,2,8,9,1,7};
	 * String array[] = { "Geeks", "forGeeks", "A computer Portal" };
	 * System.out.println("Arrays: "+ Arrays.toString(arr));
	 * //System.out.println("Arrays: "+ Arrays.toString(array)); List<Integer> list=
	 * convertArrayToList(array); System.out.println(list);
	 * 
	 * //System.out.println(Arrays.toString(arrayList)); }
	 */
	 
	 public static void main(String args[]) 
	    { 
	        // Create an Array 
	        String array[] = { "Geeks", "forGeeks",  
	                                    "A computer Portal" }; 
	        // Print the Array 
	        System.out.println("Array: "
	                            + Arrays.toString(array)); 
	  
	        // convert the Array to List 
	        List<String> 
	            list = convertArrayToList(array); 
	  
	        // Print the List 
	        System.out.println("List: " + list); 
	    } 
}

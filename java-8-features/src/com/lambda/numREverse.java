package com.lambda;

import java.util.Scanner;

public class numREverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		//int value=in.nextInt();
		int value=12565;
		//System.out.println(n%10);
		int num,rev=0;
		  while(value != 0)
		  { 
			   num= value%10; 
			  rev=num+rev*10;
			  value=value/10;
			 
		  }
		  System.out.println(rev);  
		

	}

}

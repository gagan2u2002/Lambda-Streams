package com.etechon.lambdastream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main (String[] args) {
		String[] name = {"Gagan","Sid","Jitu", "Alex","John"};
		List<Integer> myIntegerList = Arrays.asList(1,2,3,4,5); 
		Arrays.stream(name)
		      .sorted()
		      .filter(x->x.startsWith("G"))
		      .forEach(x-> System.out.println(x));
		
		  // create a logic give the value , double the even number and send me the sum
//	      int sum= 0;
//	      for (Integer value : myIntegerList) {
//			if (value%2==0) {
//				sum = sum+ value*2;
//		
//			}
//		  }
//	     System.out.println("Sum of even number is  :"+sum);
		
		// above code using stream
		System.out.println("sum of even number is "+
		myIntegerList.stream()
		             .filter(number -> number%2==0)
		             .mapToInt(number-> number*2)
		             .sum());
		             
		
	}
}

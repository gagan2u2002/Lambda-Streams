package com.etechon.lambdastream;

import java.util.Arrays;
import java.util.List;

/***
 * When you execute this programme you can get parallelStream will take lesser time 
 * with respect to stream.
 * 
 *
 */
public class StreamAndParallelStream {

	public static void main(String[] args) {

		List<Integer> myIntegerList = Arrays.asList(1,2,3,4,5,6,7,8,8,10);
	    computebyStream(myIntegerList);
	    computebyParallelStream(myIntegerList);
	}

	private static void computebyParallelStream(List<Integer> myIntegerList) {
		System.out.println("Execution START for Parallelstream :");
		 long startTime = System.currentTimeMillis();
			System.out.println(
			myIntegerList.parallelStream()
			             .filter(number -> number%2==0)
			             .mapToInt(number -> compute(number))
			             .sum());
	       long endTime =  System.currentTimeMillis();
	       long approxTime = endTime- startTime;
			System.out.println("Execution Time in mill " + approxTime);
		
		System.out.println("Execution END  for Parallelstream :");
		
	}

	private static void computebyStream(List<Integer> myIntegerList) {
		System.out.println("Execution START for stream :");
		 long startTime = System.currentTimeMillis();
			System.out.println(
			myIntegerList.stream()
			             .filter(number -> number%2==0)
			             .mapToInt(number -> compute(number))
			             .sum());
	       long endTime =  System.currentTimeMillis();
	       long approxTime = endTime- startTime;
			System.out.println("Execution Time in mill " + approxTime);
		
		System.out.println("Execution END for stream :");
		
	}

	private static int compute(Integer number) {

		number = number*2;
		try {
		Thread.sleep(1000);}
		catch (Exception e) {
			
		}
		return number;
	}

}

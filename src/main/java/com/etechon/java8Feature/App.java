package com.etechon.java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * This is basic code for students so that the will know the better way for 
 * traverse the list.
 * Difference show here between , for , for-each , consumer and stream implementation.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> myList= Arrays.asList(1,2,3,4,5,10,45);
    	
    	// External Iterator
    	System.out.println("Value from for loop");
    	for (int i=0;i<myList.size();i++) {
    		
    		System.out.println(myList.get(i));
    	}
    	
       // More significant way - but again it is a external Iterator
    	System.out.println("Value from for each loop");
    	for (Integer value : myList) {
			System.out.println(value);
		}
    	
    	//internal iterator
    	System.out.println("Value from for each consumer");
    	myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {			
				System.out.println(t);
			}
    		
		});
    	
    	//stream implementation
    	System.out.println("Value from Stream Implemenation");
    	myList.stream().forEach(i->System.out.println(i));
    	
    }
}

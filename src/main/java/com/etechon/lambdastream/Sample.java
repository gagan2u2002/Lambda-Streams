package com.etechon.lambdastream;

import java.util.Arrays;
import java.util.List;



public class Sample {

	public static void main(String[] args) {

       List<Integer> myList= Arrays.asList(1,2,3,4,5);
       
       List<String> myListName = Arrays.asList("gagan","tyagi","Mayank","Sid");
       
       //Java 8 have type inference only for lambda expression
       // no need to tell collection pass is a String 
       
      /* myListName.stream()
             .filter( (String name) -> name.equals("tyagi"))
              .forEach(name-> System.out.println(name)); */
       
       //Take a note paranthesis is optional in case lambda only have one parameter
       myListName.stream()
                  .filter(name -> name.equals("tyagi"))
                  .forEach(name-> System.out.println(name));
       
       // same thing we can achieve with method references 
       
       myListName.stream()
                 .filter(name-> name.equals("tyagi"))
                 .forEach(System.out::println);
       
	}

}

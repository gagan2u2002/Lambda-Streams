package com.etechon.java8Feature;

import java.util.Arrays;
import java.util.List;



public class Sample {

	public static void main(String[] args) {

       List<Integer> myList= Arrays.asList(1,2,3,4,5);
       
       List<String> myListName = Arrays.asList("gagan","tyagi","Mayank","Sid");
       myListName.stream()
                  .filter(name -> name.equals("tyagi"))
                  .forEach(name-> System.out.println(name));
       
	}

}

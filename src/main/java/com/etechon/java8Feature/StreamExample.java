package com.etechon.java8Feature;

import java.util.Arrays;

public class StreamExample {

	public static void main (String[] args) {
		String[] name = {"Gagan","Sid","Jitu", "Alex","John"};
		Arrays.stream(name)
		      .sorted()
		      .filter(x->x.startsWith("G"))
		      .forEach(x-> System.out.println(x));
	}
}

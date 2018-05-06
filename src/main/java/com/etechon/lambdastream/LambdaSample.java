package com.etechon.lambdastream;

import java.util.Arrays;
import java.util.List;

/**
 * This class is help you to understand lambda
 * Take a note lambda expression should not contains more than one line
 * if you labda expression have more than a line then try to do refactor
 * Multipe lines in Lambda is not recommended.
 *
 */
public class LambdaSample {

	public static void main(String[] args) {
		System.out.println("Lets start the lambda");
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(number->System.out.println(getFactors(number)));
        
        
	}

	private static int getFactors(Integer number) {
		int count=0;
		for (int i = 1;i<=number;i++) {
			if (number%i==0) {
				count++;
			}
		}
		return count;
	}

}

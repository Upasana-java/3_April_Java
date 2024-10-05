// Write a Java program that reads a positive integer and count the number of digits the number.
// Input an integer number less than ten billion: 125463
// Number of digits in the number: 6

package com.assignment2;

import java.util.Scanner;

public class DigitCounter 
{
            
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Input an integer number less than ten billion: ");
	        long number = scanner.nextLong();
	        
	        if (number < 0) {
	            number = -number; // Make sure the number is positive
	        }
	        
	        if (number >= 10000000000L) {
	            System.out.println("The number is not less than ten billion.");
	        } else {
	            int digitCount = countDigits(number);
	            System.out.println("Number of digits in the number: " + digitCount);
	        }
	        
	        scanner.close();
	    }

	    public static int countDigits(long number) {
	        if (number == 0) {
	            return 1;
	        }
	        
	        int count = 0;
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        
	        return count;
	    }
}

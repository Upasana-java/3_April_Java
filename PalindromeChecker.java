// Write a java program to reverse a string and check that the string is palindrome or not.

package com.assignment2;

import java.util.Scanner;

public class PalindromeChecker 
{
          
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Reverse the string
	        String reversedString = reverseString(inputString);

	        // Check if the string is a palindrome
	        boolean isPalindrome = checkPalindrome(inputString, reversedString);

	        // Display the result
	        System.out.println("Reversed string: " + reversedString);
	        if (isPalindrome) 
	        {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }

	    public static String reverseString(String str) {
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        return reversed;
	    }

	    public static boolean checkPalindrome(String original, String reversed) {
	        return original.equals(reversed);
	    }
}

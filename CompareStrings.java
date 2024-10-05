package com.assignment2;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        // Prompt the user to enter the second string (character sequence)
        System.out.print("Enter the second string (character sequence): ");
        String str2 = scanner.nextLine();
        
        // Compare the two strings using the equals() method
        boolean result = str1.equals(str2);
        
        // Display the result of the comparison
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + result);
        
        // Close the scanner
        scanner.close();
    }
}

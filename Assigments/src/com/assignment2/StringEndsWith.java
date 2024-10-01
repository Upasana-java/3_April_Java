package com.assignment2;

import java.util.Scanner;

public class StringEndsWith {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user to enter the ending string
        System.out.print("Enter the ending string: ");
        String endingString = scanner.nextLine();
        
        // Check if the main string ends with the given ending string
        boolean result = mainString.endsWith(endingString);
        
        // Display the result
        System.out.println("\"" + mainString + "\" ends with \"" + endingString + "\"? " + result);
        
        // Close the scanner
        scanner.close();
    }
}

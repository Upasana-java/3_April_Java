package com.assignment2;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Concatenate the two strings
        String concatenatedString = str1 + str2;
        
        // Display the concatenated result
        System.out.println("Concatenated String: " + concatenatedString);
        
        // Close the scanner
        scanner.close();
    }
}

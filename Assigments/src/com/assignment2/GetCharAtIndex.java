package com.assignment2;

import java.util.Scanner;

public class GetCharAtIndex {
    public static void main(String[] args) {
        // Original string
        String str = "Tops Technologies!";
        
        // Display the original string
        System.out.println("Original String: " + str);
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the index
        System.out.print("Enter the index to get the character: ");
        int index = scanner.nextInt();
        
        // Check if the index is within the bounds of the string
        if (index >= 0 && index < str.length()) {
            // Get the character at the specified index
            char charAtPosition = str.charAt(index);
            
            // Display the character at the specified index
            System.out.println("The character at position " + index + " is: " + charAtPosition);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (str.length() - 1));
        }
        
        // Close the scanner
        scanner.close();
    }
}

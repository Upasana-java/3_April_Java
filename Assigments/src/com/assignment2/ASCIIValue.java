package com.assignment2;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Get the ASCII value of the character
        int asciiValue = (int) ch;
        
        // Print the ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        
        // Close the scanner
        scanner.close();
    }
}

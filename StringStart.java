package com.assignment2;

import java.util.Scanner;

public class StringStart {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user to enter the starting string
        System.out.print("Enter the starting string: ");
        String startingString = scanner.nextLine();
        
        // Check if the main string starts with the given starting string
        boolean result = mainString.startsWith(startingString);
        
        // Display the result
        System.out.println("\"" + mainString + "\" starts with \"" + startingString + "\"? " + result);
        
        // Close the scanner
        scanner.close();
    }
}

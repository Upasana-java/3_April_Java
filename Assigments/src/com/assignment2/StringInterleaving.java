package com.assignment2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringInterleaving {
    
    // Function to find all interleavings of two strings
    public static void interleave(String str1, String str2, String result, Set<String> interleavings) {
        // If both strings are empty, add the result to the set
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(result);
            return;
        }
        
        // If there are characters left in the first string, add the first character to the result and recurse
        if (!str1.isEmpty()) {
            interleave(str1.substring(1), str2, result + str1.charAt(0), interleavings);
        }
        
        // If there are characters left in the second string, add the first character to the result and recurse
        if (!str2.isEmpty()) {
            interleave(str1, str2.substring(1), result + str2.charAt(0), interleavings);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Set to store unique interleavings
        Set<String> interleavings = new HashSet<>();
        
        // Find all interleavings of the two strings
        interleave(str1, str2, "", interleavings);
        
        // Display the interleaving strings
        System.out.println("The interleaving strings are:");
        for (String interleave : interleavings) {
            System.out.println(interleave);
        }
        
        // Close the scanner
        scanner.close();
    }
}

package com.assignment2;

import java.util.Scanner;

public class ComputeSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        // Compute the values of n, nn, and nnn
        int nn = Integer.parseInt("" + n + n);   // Concatenating n to form nn
        int nnn = Integer.parseInt("" + n + n + n); // Concatenating n to form nnn
        
        // Compute the sum n + nn + nnn
        int result = n + nn + nnn;
        
        // Print the result
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
        
        // Close the scanner
        scanner.close();
    }
}

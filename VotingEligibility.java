package com.assignment2;

import java.util.Scanner;

public class VotingEligibility {

    // Method to validate the age
    public static void validate(int age) {
        if (age < 18) {
            // Throwing ArithmeticException if age is less than 18
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        // Taking age input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Validating the age
            validate(age);
        } catch (ArithmeticException e) {
            // Catching and printing the exception
            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

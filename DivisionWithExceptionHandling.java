package com.assignment2;

import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking two numbers from the user
            System.out.print("Enter two numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            
            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

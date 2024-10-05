package com.assignment2;

public class CommandLineDivision {
    public static void main(String[] args) {
        try {
            // Convert command line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling divide by zero exception
            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handling invalid number format exception
            System.out.println("Please provide valid integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling missing command line arguments
            System.out.println("Please provide two command line arguments.");
        }
    }
}
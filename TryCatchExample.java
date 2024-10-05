package com.assignment2;

public class TryCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        try {
            // Attempting to access an index that doesn't exist
            System.out.println("The 4th element is: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block handling ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: " + e);
        } finally {
            // Optional finally block to run code whether an exception occurs or not
            System.out.println("Finally block executed.");
        }
        
        System.out.println("Program continues after try-catch.");
    }
}

package com.assignment2;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            // Creating an array of size 5
            int a[] = new int[5];

            // This line will throw ArithmeticException (division by zero)
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            // Catch block to handle divide by zero
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle array index out of bounds
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

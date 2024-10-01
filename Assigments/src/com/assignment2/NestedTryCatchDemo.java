package com.assignment2;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block for division by zero
                int a[] = new int[5];

                // This line will throw ArithmeticException (division by zero)
                a[5] = 30 / 0;
            } catch (ArithmeticException e) {
                // Inner catch block to handle divide by zero
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }

            int[] a = null;
			// This code will execute after inner try-catch, and might throw ArrayIndexOutOfBoundsException
            a[5] = 50;  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Outer catch block to handle array index out of bounds
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch.");
    }
}

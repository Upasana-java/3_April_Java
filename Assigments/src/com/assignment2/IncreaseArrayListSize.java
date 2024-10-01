package com.assignment2;

import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<String> colors = new ArrayList<>(2); // Initial capacity of 2

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");

        // Print the original ArrayList and its size
        System.out.println("Original ArrayList: " + colors);
        System.out.println("Original size: " + colors.size());

        // Increase the size of the ArrayList using ensureCapacity
        colors.ensureCapacity(10); // Ensure capacity for at least 10 elements

        // Add more colors
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the updated ArrayList and its size
        System.out.println("Updated ArrayList: " + colors);
        System.out.println("Updated size: " + colors.size());
    }
}

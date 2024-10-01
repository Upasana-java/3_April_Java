package com.assignment2;

import java.util.ArrayList;

public class SwapArrayListElements {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Indices of the elements to swap
        int index1 = 1; // Green
        int index2 = 3; // Yellow

        // Swap the elements
        String temp = colors.get(index1);
        colors.set(index1, colors.get(index2));
        colors.set(index2, temp);

        // Print the updated ArrayList
        System.out.println("ArrayList after swapping elements at indices " + index1 + " and " + index2 + ": " + colors);
    }
}

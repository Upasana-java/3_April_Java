package com.assignment2;

import java.util.ArrayList;

public class RemoveThirdElement {
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

        // Remove the third element (index 2)
        colors.remove(2); // Removes "Blue", which is at index 2 (third element)

        // Print the updated ArrayList
        System.out.println("Updated ArrayList after removing third element: " + colors);
    }
}

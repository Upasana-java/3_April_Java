package com.assignment2;

import java.util.ArrayList;

public class ExtractPortionOfArrayList {
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

        // Extract a portion of the ArrayList (from index 1 to 3)
        // This will include elements at index 1 and 2 (Green and Blue)
        ArrayList<String> subList = new ArrayList<>(colors.subList(1, 3));

        // Print the extracted portion
        System.out.println("Extracted portion of the ArrayList: " + subList);
    }
}

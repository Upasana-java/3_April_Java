package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
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

        // Sort the ArrayList
        Collections.sort(colors);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + colors);
    }
}

package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
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

        // Shuffle the ArrayList
        Collections.shuffle(colors);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + colors);
    }
}

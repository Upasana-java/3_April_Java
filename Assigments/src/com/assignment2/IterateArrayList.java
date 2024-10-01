package com.assignment2;

import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterate through the ArrayList and print each color
        System.out.println("Iterating through the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

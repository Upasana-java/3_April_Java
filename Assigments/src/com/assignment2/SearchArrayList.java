package com.assignment2;

import java.util.ArrayList;

public class SearchArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Element to search for
        String searchElement = "Blue";

        // Check if the element is present in the ArrayList
        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " is found in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }
    }
}

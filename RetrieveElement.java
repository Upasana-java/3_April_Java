package com.assignment2;

import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the index of the element to retrieve
        int index = 2;

        // Retrieve the element at the specified index
        String element = colors.get(index);

        // Print the retrieved element
        System.out.println("Element at index " + index + ": " + element);
    }
}

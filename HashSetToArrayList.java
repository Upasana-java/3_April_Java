package com.assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet and add some colors
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the original HashSet
        System.out.println("Original HashSet: " + colors);

        // Convert the HashSet to an ArrayList
        List<String> colorsList = new ArrayList<>(colors);

        // Print the ArrayList
        System.out.println("Converted ArrayList: " + colorsList);
    }
}

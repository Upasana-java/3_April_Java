package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create a source ArrayList to store colors
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");

        // Create a destination ArrayList with the same size as sourceList
        ArrayList<String> destList = new ArrayList<>(sourceList.size());

        // Add placeholder elements to destList to match the size of sourceList
        for (int i = 0; i < sourceList.size(); i++) {
            destList.add(""); // Adding empty strings to match the size
        }

        // Copy elements from sourceList to destList
        Collections.copy(destList, sourceList);

        // Print both ArrayLists
        System.out.println("Source ArrayList: " + sourceList);
        System.out.println("Destination ArrayList after copying: " + destList);
    }
}

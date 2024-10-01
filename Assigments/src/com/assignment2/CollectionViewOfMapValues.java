package com.assignment2;

import java.util.HashMap;
import java.util.Collection;

public class CollectionViewOfMapValues {
    public static void main(String[] args) {
        // Create a HashMap to store color names and their corresponding codes
        HashMap<String, String> colorCodes = new HashMap<>();

        // Add some key-value pairs to the HashMap
        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");
        colorCodes.put("Yellow", "#FFFF00");

        // Print the original HashMap
        System.out.println("Original HashMap: " + colorCodes);

        // Get a collection view of the values contained in the HashMap
        Collection<String> values = colorCodes.values();

        // Print the collection of values
        System.out.println("Collection view of the values: " + values);
    }
}

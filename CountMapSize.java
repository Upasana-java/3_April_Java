package com.assignment2;

import java.util.HashMap;

public class CountMapSize {
    public static void main(String[] args) {
        // Create a HashMap to store colors and their corresponding codes
        HashMap<String, String> colorCodes = new HashMap<>();

        // Add some key-value pairs to the HashMap
        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");
        colorCodes.put("Yellow", "#FFFF00");

        // Count the number of key-value mappings in the HashMap
        int numberOfMappings = colorCodes.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the HashMap: " + numberOfMappings);
    }
}

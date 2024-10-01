package com.assignment2;

import java.util.HashMap;

public class AssociateValueWithKey {
    public static void main(String[] args) {
        // Create a HashMap to store colors and their corresponding codes
        HashMap<String, String> colorCodes = new HashMap<>();

        // Associate values with keys
        colorCodes.put("Red", "#FF0000");
        colorCodes.put("Green", "#00FF00");
        colorCodes.put("Blue", "#0000FF");

        // Print the original HashMap
        System.out.println("Original HashMap: " + colorCodes);

        // Associate a new value with a specified key
        String key = "Yellow";
        String value = "#FFFF00";
        colorCodes.put(key, value); // Add Yellow with its color code

        // Print the updated HashMap
        System.out.println("Updated HashMap after adding " + key + ": " + colorCodes);
    }
}

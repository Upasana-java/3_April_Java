package com.assignment2;

import java.util.HashMap;

public class CheckMapEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> colorCodes = new HashMap<>();

        // Check if the HashMap is empty
        if (colorCodes.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Adding an entry to the HashMap
        colorCodes.put("Red", "#FF0000");

        // Check again if the HashMap is empty
        if (colorCodes.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}

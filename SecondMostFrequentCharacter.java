package com.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.PriorityQueue;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        // Create a map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Use a priority queue to sort characters by frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue().compareTo(a.getValue())
        );
        maxHeap.addAll(frequencyMap.entrySet());
        
        // Find the second most frequent character
        Map.Entry<Character, Integer> first = maxHeap.poll();
        Map.Entry<Character, Integer> second = null;
        
        if (!maxHeap.isEmpty()) {
            second = maxHeap.poll();
        }
        
        // Display the result
        if (second != null) {
            System.out.println("The second most frequent char in the string is: " + second.getKey());
        } else {
            System.out.println("There is no second most frequent character.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

package com.assignment2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {
    public static void main(String[] args) {
        // Get the current system time
        LocalTime currentTime = LocalTime.now();
        
        // Format the time in HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        // Display the current time
        System.out.println("Current system time: " + formattedTime);
    }
}

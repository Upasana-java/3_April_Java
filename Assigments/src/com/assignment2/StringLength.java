// • Write a java program Find out length of string without using inbuilt function

package com.assignment2;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate the length of the string
        int length = findStringLength(inputString);

        // Display the result
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }

    public static int findStringLength(String str) {
        int length = 0;
        char[] charArray = str.toCharArray();

        for (@SuppressWarnings("unused") char c : charArray) {
            length++;
        }

        return length;
    }
}
 

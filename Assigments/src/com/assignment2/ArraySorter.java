// Write A Java Program to take two Array input from user and sort them in ascending or descending order as per user’s choice


package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ArraySorter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the first array
        System.out.print("Enter the number of elements in the first array: ");
        int size1 = scanner.nextInt();
        Integer[] array1 = new Integer[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) 
        {
            array1[i] = scanner.nextInt();
        }

        // Input the second array
        System.out.print("Enter the number of elements in the second array: ");
        int size2 = scanner.nextInt();
        Integer[] array2 = new Integer[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) 
        {
            array2[i] = scanner.nextInt();
        }

        // Get the sorting order from the user
        System.out.print("Enter 'asc' for ascending order or 'desc' for descending order: ");
        String order = scanner.next();

        // Sort the arrays
        sortArray(array1, order);
        sortArray(array2, order);

        // Print the sorted arrays
        System.out.println("First array sorted:");
        printArray(array1);
        System.out.println("Second array sorted:");
        printArray(array2);

        scanner.close();
    }

    public static void sortArray(Integer[] array, String order) 
    {
        if (order.equalsIgnoreCase("asc")) 
        {
            Arrays.sort(array);
        } else if (order.equalsIgnoreCase("desc")) 
         {
            Arrays.sort(array, Collections.reverseOrder());
        } else 
         {
            System.out.println("Invalid order specified. Sorting in ascending order by default.");
            Arrays.sort(array);
        }
    }

    public static void printArray(Integer[] array) 
    {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

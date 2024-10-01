package com.assignment2;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");

        // Create a third ArrayList with different elements
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Yellow");
        list3.add("Purple");

        // Compare the two ArrayLists
        boolean areEqual = list1.equals(list2);
        boolean areDifferent = list1.equals(list3);

        // Print the comparison results
        System.out.println("List1 is equal to List2: " + areEqual); // true
        System.out.println("List1 is equal to List3: " + areDifferent); // false
    }
}

package com.assignment2;

import java.util.ArrayList;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");

        // Print the original ArrayLists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Join the two ArrayLists
        list1.addAll(list2);

        // Print the joined ArrayList
        System.out.println("Joined ArrayList: " + list1);
    }
}


package com.assignment2;

class Member {
    // Data members
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor to initialize data members
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to print all details of the member
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

public class employeedetails {
    public static void main(String[] args) {
        // Creating an object of the Member class
        Member member = new Member("upasana", 25, "123-456-7890", "mehsana", 50000.0);

        // Printing all details of the member
        member.printDetails();
    }
}


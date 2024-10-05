/* Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an 
object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of
parent class by object of child class    */

package com.assignment2;

class Parent {
    // Method to print a message from the parent class
    public void printMessage() {
        System.out.println("This is a parent class");
    }
}

class Child extends Parent {
    // Method to print a message from the child class
    public void printMessageChild() {
        System.out.println("This is a child class");
    }
}

public class parentchild 
{
    public static void main(String[] args) {
        // Creating an object of the parent class
        Parent parent = new Parent();
        // Calling the method of the parent class by the object of the parent class
        parent.printMessage();

        // Creating an object of the child class
        Child child = new Child();
        // Calling the method of the child class by the object of the child class
        child.printMessageChild();

        // Calling the method of the parent class by the object of the child class
        child.printMessage();
    }
}

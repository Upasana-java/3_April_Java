package com.assignment2;


class Rectangle {
    // Data members
    protected double length;
    protected double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and print the area of the rectangle
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and print the perimeter of the rectangle
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle {
    // Constructor to initialize side of square using super class constructor
    public Square(double side) {
        super(side, side); // calling parent class constructor with side as both length and breadth
    }

    // Overriding method to calculate and print the area of the square
    @Override
    public void printArea() {
        double area = length * length; // since length == breadth for square
        System.out.println("Area of Square: " + area);
    }

    // Overriding method to calculate and print the perimeter of the square
    @Override
    public void printPerimeter() {
        double perimeter = 4 * length; // since length == breadth for square
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

public class perimeterofareaandrectangle {
    public static void main(String[] args) {
        // Creating an object of Rectangle class
        Rectangle rectangle = new Rectangle(5, 10);
        // Calling methods to print area and perimeter of rectangle
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.println(); // Adding space for better readability

        // Creating an object of Square class
        Square square = new Square(4);
        // Calling methods to print area and perimeter of square
        square.printArea();
        square.printPerimeter();
    }
}


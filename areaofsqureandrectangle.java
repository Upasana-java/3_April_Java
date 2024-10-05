/* Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for 
printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter 
which is side of square */

package com.assignment2;

 class shape
{
           
	   // Method to calculate and print the area of a square
    public void printArea(double side) {
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }

    // Method to calculate and print the area of a rectangle
    public void printArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class areaofsqureandrectangle  {
    public static void main(String[] args) {
        shape shape = new shape();

        // Calculate and print the area of a square
        double side = 5.0;
        shape.printArea(side);

        // Calculate and print the area of a rectangle
        double length = 7.0;
        double breadth = 3.0;
        shape.printArea(length, breadth);
    }
}

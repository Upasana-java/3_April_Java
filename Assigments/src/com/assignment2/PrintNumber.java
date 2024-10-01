package com.assignment2;

public class PrintNumber {
    
    // Method to print an integer
    public void printn(int number) {
        System.out.println("Integer: " + number);
    }
    
    // Method to print a double
    public void printn(double number) {
        System.out.println("Double: " + number);
    }
    
    // Method to print a float
    public void printn(float number) {
        System.out.println("Float: " + number);
    }
    
    // Method to print a long
    public void printn(long number) {
        System.out.println("Long: " + number);
    }
    
    // Method to print a short
    public void printn(short number) {
        System.out.println("Short: " + number);
    }
    
    // Method to print a byte
    public void printn(byte number) {
        System.out.println("Byte: " + number);
    }

    public static void main(String[] args) {
        // Create an instance of the PrintNumber class
        PrintNumber printer = new PrintNumber();
        
        // Call each overloaded method with different data types
        printer.printn(10);           // Calls method with int
        printer.printn(10.5);         // Calls method with double
        printer.printn(10.5f);        // Calls method with float
        printer.printn(100000L);     // Calls method with long
        printer.printn((short) 5);   // Calls method with short
        printer.printn((byte) 1);    // Calls method with byte
    }
}

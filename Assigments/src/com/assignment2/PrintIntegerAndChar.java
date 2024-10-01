package com.assignment2;

public class PrintIntegerAndChar {

    // Method with (int, char) parameter sequence
    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }
    
    // Method with (char, int) parameter sequence
    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        // Create an instance of the PrintIntegerAndChar class
        PrintIntegerAndChar printer = new PrintIntegerAndChar();
        
        // Call each overloaded method with different parameter sequences
        printer.print(10, 'A');   // Calls method with (int, char)
        printer.print('B', 20);   // Calls method with (char, int)
    }
}

package com.assignment2;

import java.util.Scanner;

//Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private double deficit;

 public InsufficientBalanceException(double deficit) {
     this.deficit = deficit;
 }

 @Override
 public String getMessage() {
     return "Sorry, insufficient balance, you need more " + deficit + " Rs. to perform this transaction.";
 }
}

 class BankAccount {
 private double balance;

 // Constructor to initialize the account balance
 public BankAccount(double balance) {
     this.balance = balance;
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         // If withdrawal amount is greater than balance, throw custom exception
         double deficit = amount - balance;
         throw new InsufficientBalanceException(deficit);
     } else {
         balance -= amount;
         System.out.println("Withdrawal successful! Remaining balance: " + balance + " Rs.");
     }
 }

 public static void main(String[] args) {
     // Initialize account balance
     BankAccount account = new BankAccount(2000);

     // Taking withdrawal amount from the user
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter withdrawal amount: ");
     double withdrawAmount = scanner.nextDouble();

     try {
         // Attempt to withdraw the amount
         account.withdraw(withdrawAmount);
     } catch (InsufficientBalanceException e) {
         // Catch and display custom exception message
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}

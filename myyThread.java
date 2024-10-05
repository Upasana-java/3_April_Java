package com.assignment2;

//Class extending Thread class
class MyThread extends Thread {
 @Override
 public void run() {
     // Code to be executed by the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + ": " + i);
         try {
             // Making the thread sleep for a short time (500 ms) between iterations
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
}

 class ThreadDemo {
 public static void main(String[] args) {
     // Creating an instance of MyThread
     MyThread thread = new MyThread();

     // Starting the thread
     thread.start();

     // Main thread continues execution
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + ": Main Thread " + i);
         try {
             Thread.sleep(700); // Main thread sleeps for 700 ms
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted: " + e.getMessage());
         }
     }
 }
}

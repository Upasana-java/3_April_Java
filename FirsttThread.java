package com.assignment2;

//Class extending Thread to create the first thread
class FirstThread extends Thread {
 @Override
 public void run() {
     try {
         System.out.println(Thread.currentThread().getName() + " is executing.");
         Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
         System.out.println(Thread.currentThread().getName() + " has finished execution.");
     } catch (InterruptedException e) {
         System.out.println("FirstThread interrupted: " + e.getMessage());
     }
 }
}

//Class extending Thread to create the second thread
class SecondThread extends Thread {
 @Override
 public void run() {
     try {
         System.out.println(Thread.currentThread().getName() + " is executing.");
         Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
         System.out.println(Thread.currentThread().getName() + " has finished execution.");
     } catch (InterruptedException e) {
         System.out.println("SecondThread interrupted: " + e.getMessage());
     }
 }
}

class MultiThreadDemo {
 public static void main(String[] args) {
     // Creating instances of FirstThread and SecondThread
     FirstThread thread1 = new FirstThread();
     SecondThread thread2 = new SecondThread();

     // Starting both threads
     thread1.start();
     thread2.start();

     // Wait for both threads to complete
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }

     System.out.println("Both threads have finished execution.");
 }
}

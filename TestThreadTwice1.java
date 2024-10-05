package com.assignment2;

//Class extending Thread to demonstrate starting a thread twice
class TestThreadTwice1 extends Thread {
 @Override
 public void run() {
     try {
         System.out.println(Thread.currentThread().getName() + " is executing.");
         Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
         System.out.println(Thread.currentThread().getName() + " has finished execution.");
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted: " + e.getMessage());
     }
 }
}

 class ThreadTwiceDemo {
 public static void main(String[] args) {
     // Create an instance of TestThreadTwice1
     TestThreadTwice1 t1 = new TestThreadTwice1();

     // Start the thread
     t1.start();

     try {
         // Attempt to start the thread again (this will throw an exception)
         t1.start();
     } catch (IllegalThreadStateException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}

package com.assignment2;

//Class extending Thread to demonstrate daemon threads
class TestDaemonThread2 extends Thread {
 @Override
 public void run() {
     try {
         while (true) {
             System.out.println(Thread.currentThread().getName() + " is running.");
             Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
         }
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted: " + e.getMessage());
     }
 }
}

 class DaemonThreadDemo {
 public static void main(String[] args) {
     // Create two instances of TestDaemonThread2
     TestDaemonThread2 t1 = new TestDaemonThread2();
     TestDaemonThread2 t2 = new TestDaemonThread2();

     // Start the threads
     t1.start();

     // Set t1 as a daemon thread
     try {
         t1.setDaemon(true);
         System.out.println("t1 is daemon: " + t1.isDaemon());
     } catch (IllegalThreadStateException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     // Start the second thread
     t2.start();

     // Check if t1 is a daemon thread
     System.out.println("t1 is daemon: " + t1.isDaemon());
     System.out.println("t2 is daemon: " + t2.isDaemon());
 }
}

// Write a Java program to create deadlock type situation using multiple threads.
// Output: Deadlock is created between thread 1 and thread 2. 
// You have to manually terminate program.

import java.util.*;
class Deadlock {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { 
                    Thread.sleep(10); 
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class Thread2 extends Thread {
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { 
                    Thread.sleep(10); 
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}

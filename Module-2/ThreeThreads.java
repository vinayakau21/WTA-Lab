// Write a program for creating three threads randomly using following methods:
// a. By extending Thread class
// b. By implementing Runnable interface


// import java.util.*;
// class ThreeThreads extends Thread {
//     ThreeThreads(String threadName) {
//         super(threadName);
//     }
//     // target run() method is automatically called whenever thread gets a chance to execute
//     public void run() {
//         System.out.println("Thread "+ Thread.currentThread().getName() +" is runnning");
//     }
//     public static void main(String[] args) {
//         ThreeThreads t1 = new ThreeThreads("t1");
//         ThreeThreads t2 = new ThreeThreads("t2");
//         ThreeThreads t3 = new ThreeThreads("t3");
//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }


// import java.io.*;

// class ThreeThreads implements Runnable
// {
//     // target run() method is automatically called whenever thread gets a chance to execute
//     public void run()
//     {
//         System.out.println("Thread is running inside");
//     }
//     public static void main(String args[])
//     {
//         ThreeThreads th1 = new ThreeThreads();
//         Thread t1 = new Thread(th1);
//         t1.start();
//         Thread t2 = new Thread(th1);
//         t2.start();
//         Thread t3 = new Thread(th1);
//         t3.start();
//     }
// }

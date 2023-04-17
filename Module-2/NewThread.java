// Write a program to create a new thread by extending a thread class.
// a. Get the current thread name
// b. Set the highest priority to the newly created thread
// c. Pause a thread for 2.5 seconds.
// d. Check whether the thread is in running state or not.
// e. Verify your newly created thread must be completed first before your main
// thread is completed.

import java.util.*;
class NewThread extends Thread{
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.start();
        System.out.println("Currect thread name is " + Thread.currentThread().getName());
        t1.setPriority(MIN_PRIORITY);
        System.out.println("Thread priority is " + t1.getPriority());
        try {
            Thread.sleep(2500);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("New thread state is " + t1.getState());
        System.out.println("Main thread state is " + Thread.currentThread().getState());
    }
}
// Write a Java Program to implement the concept of inter thread communication
// with very famous producer consumer problem.

import java.util.*;
class ThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static class PC {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int capacity = 1;
        public void produce() throws InterruptedException{
            int value = 0, i=0;
            while (i<10) {
                synchronized (this){
                    while (list.size() == capacity)
                        wait();
                    System.out.println("Producer produced-"+ value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
                i++;
            }
        }
        public void consume() throws InterruptedException {
            int i=0;
            while (i<10) {
                synchronized (this){
                    while (list.size() == 0)
                        wait();
                    int val = list.removeFirst();
                    System.out.println("Consumer consumed-"+ val);
                    notify();
                    Thread.sleep(1000);
                }
                i++;
            }
        }
    }
}

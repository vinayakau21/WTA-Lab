// Write a thread program to demonstrate stop(), sleep(), isAlive () and join ().

import java.util.*;
public class ThreadOperations extends Thread{
    public void run(){
    for(int i = 0; i <= 3; i++){
        try{
            Thread.sleep(2000);
        } catch(Exception e) {
            System.out.println(e);
        }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        ThreadOperations t1 = new ThreadOperations();
        ThreadOperations t2 = new ThreadOperations();
        t1.start();
        System.out.println("Thread t1 alive -> " + t1.isAlive());
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thread t1 alive -> " + t1.isAlive());
        t2.start();
    }
}
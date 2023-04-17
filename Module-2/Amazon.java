// Assume that only one copy of the book is available in Amazon and four
// customers are trying to place the order for book at the same time. Write a java
// program using threads which prints book confirmed for one person and out of stock for others


public class Amazon implements Runnable{
    static int noOfBooks = 1;
    synchronized public void run() {
        if(noOfBooks > 0) {
            noOfBooks--;
            System.out.println("Confirmed");
        }
        else {
            System.out.println("Out of stock");
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new Amazon(),"Thread1");
        Thread t2=new Thread(new Amazon(),"Thread2");
        Thread t3=new Thread(new Amazon(),"Thread3");
        Thread t4=new Thread(new Amazon(),"Thread4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
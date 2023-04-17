// solution to come out from the deadlock.

public class AvoidDeadlock
{
    public static void main(String[] args) throws InterruptedException
    {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Thread thread1 = new Thread(new SynchroniseThread(object1, object2),"thread1");
        Thread thread2 = new Thread(new SynchroniseThread(object2, object3),"thread2");
        thread1.start();
        Thread.sleep(2000);
        thread2.start();
        Thread.sleep(2000);
    }
}
class SynchroniseThread implements Runnable
{
    private Object object1;
    private Object object2;
    public SynchroniseThread(Object o1, Object o2)
    {
        this.object1 = o1;
        this.object2 = o2;
    }
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquire lock on " + object1);
        synchronized (object1)
        {
            System.out.println(name + " acquired lock on " + object1);
            work();
        }
        System.out.println(name + " released lock of " + object1);
        System.out.println(name + " acquire lock on " + object2);
        synchronized (object2)
        {
            System.out.println(name + " acquire lock on " + object2);
            work();
        }
        System.out.println(name + " released lock of " + object2);
        System.out.println(name + " execution is completed.");
    }
    private void work()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

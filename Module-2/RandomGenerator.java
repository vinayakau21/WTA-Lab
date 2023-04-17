import java.util.Random;
class RandomNumberThread extends Thread{
    public void run() {
        Random random=new Random();
        for(int i = 0; i < 5; i++) {
            int randomInteger=random.nextInt(1000);
            System.out.println(randomInteger);
            if(randomInteger%2 == 0) {
                SquareThread sThread=new SquareThread(randomInteger);
                sThread.start();
            } else {
                CubeThread cThread=new CubeThread(randomInteger);
                cThread.start();
            }
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
class SquareThread extends Thread{
    int number;
    SquareThread(int n){
        number=n;
    }
    public void run() {
        System.out.println("Square of number is "+number*number);
    }
}
class CubeThread extends Thread{
    int number;
    CubeThread(int n){
        number=n;
    }
    public void run() {
        System.out.println("Cube of number is "+number*number*number);
    }
}
public class RandomGenerator {
    public static void main(String[] args) {
        RandomNumberThread r = new RandomNumberThread();
        r.start();
    }
}

import java.util.*;

public class ExceptionOverloading {
    double method(int i) throws Exception {
        return i / 0;
    }

    boolean method(boolean b) {
        return !b;
    }

    static double method(int x, double y) throws Exception {
        return x + y;
    }

    static double method(double x, double y) {
        return x + y - 3;
    }

    public static void main(String[] args) {
        ExceptionOverloading mn = new ExceptionOverloading();
        try {
            System.out.println(method(10, 20.0));
            System.out.println(method(30.0, 10));
            System.out.println(method(20.0, 40.0));
            System.out.println(mn.method(10));
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
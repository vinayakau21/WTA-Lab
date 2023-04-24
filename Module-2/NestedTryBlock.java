import java.util.*;

class NestedTryBlock {
    public static void main(String args[]) {
        try {
            try {
                System.out.println("Dividing by 0");
                int b = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[8] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("some statements");
        } catch (Exception e) {
            System.out.println("OUTER CATCH");
        }
        System.out.println("Rest of the statements");
    }
}
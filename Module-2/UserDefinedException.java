import java.util.*;

class UserDefinedException extends Exception {
    public static void main(String[] args) {
        String s = "Shalini";
        try {
            if (s.length() < 20)
                throw new Exception("String length should be more than 20.");
        } catch (Exception e) {
            System.out.println("Exception detected");
            System.out.println(e.getMessage());
        }
    }
}

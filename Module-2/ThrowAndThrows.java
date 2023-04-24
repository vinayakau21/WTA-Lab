import java.io.IOException;

class ThrowThrows {
    void fun() throws IOException {
        throw new IOException("Device Error");
    }
}

public class ThrowAndThrows {
    public static void main(String[] args) {
        try {
            ThrowThrows obj = new ThrowThrows();
            obj.fun();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("Other statements");
    }
}

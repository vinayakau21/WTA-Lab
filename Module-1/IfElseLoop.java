public class IfElseLoop {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        if(a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("b is less than a");
        }

        for(int i = 1; i <= 10; i++) {
            if(i == 3) continue;
            System.out.print(i + " ");
            if(i == 5) break;
        }
        System.out.println();

        while(b > 0) {
            System.out.print(b + " ");
            b--;
        }
        System.out.println();
    }
}
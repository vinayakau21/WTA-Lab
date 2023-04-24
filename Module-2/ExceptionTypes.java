// Write a different java program for generating following types of exception
// a. NullPointerException
// b. ArrayIndexOutOfBoundException
// c. ArithmeticException
// d. NumberFormatException
// e. StringIndexOutOfBoundException

import java.util.*;

class ExceptionTypes {
    public static void main(String[] args) {
        try {
            int a = 3 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Arithmetic Exception\n");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Null Pointer Exception\n");
        try {
            int a[] = new int[3];
            a[4] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Array Index Out Of Bounds Exception\n");
        try {
            String s = "Shalini";
            char ch = s.charAt(25);
            System.out.println(s);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("String Index Out Of Bounds Exception\n");
        try {
            String w = "Shalini";
            int n = Integer.parseInt(w);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Number Format Exception\n");
    }
}
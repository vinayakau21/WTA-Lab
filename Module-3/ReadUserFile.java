// Try running:
// java ReadUserFile.java
// Enter the filename: 
// count.txt

import java.util.*;
import java.io.*;

public class ReadUserFile {
    public static void main(String[] a) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the filename: ");
            String x = s.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(x));
            Scanner sr = new Scanner(br);
            System.out.println("File contents....");
            while (sr.hasNextLine()) {
                String data = sr.nextLine();
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

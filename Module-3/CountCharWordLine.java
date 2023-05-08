// Try running
// java CountCharWordLine.java count.txt
// o/p: 
// Number of Characters: 444
// Number of Words: 69
// Number of Lines: 8

import java.util.*;
import java.io.*;

public class CountCharWordLine {
    public static void main(String[] args) throws IOException {
        String line;
        long nl = 0, nw = 0, nc = 0;
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while ((line = br.readLine()) != null) {
            nl++;
            nc = nc + line.length();
            StringTokenizer st = new StringTokenizer(line);
            nw = nw + st.countTokens();
        }
        System.out.println("Number of Characters: " + nc);
        System.out.println("Number of Words: " + nw);
        System.out.println("Number of Lines: " + nl);
    }
}

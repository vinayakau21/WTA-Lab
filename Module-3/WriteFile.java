// java WriteFile.java write.txt
// Enter a line of text: Test input       
// Test input

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[0], true));
        writer.append(line + "\n");
        writer.close();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

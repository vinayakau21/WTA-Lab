// Try running: java ReadFile.java count.txt

import java.io.*;

class ReadFile {
    public static void main(String[] args) {
        String line;
        for (int i = 0; i < args.length; i++) {
            try {
                LineNumberReader br = new LineNumberReader(new FileReader(args[i]));
                while ((line = br.readLine()) != null) {
                    System.out.println(br.getLineNumber() + ". " + line);
                }
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
    }
}

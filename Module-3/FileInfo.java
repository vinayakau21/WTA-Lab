import java.io.File;

class FileInfo {
    public static void main(String args[]) {
        File f1 = new File("count.txt");
        if (f1.exists()) {
            System.out.println("File Name: " + f1.getName());
            System.out.println("Path: " + f1.getPath());
            System.out.println("Abs Path: " + f1.getAbsolutePath());
            System.out.println("writeable " + f1.canWrite());
            System.out.println("readable: " + f1.canRead());
            System.out.println("File size: " + f1.length() + " Bytes");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

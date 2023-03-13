import java.util.*;

class StudentDetails {
    int usn;
    String name;
    String branch;
    int phone;

    void insert(int a, String b, String c, int d) {
        usn = a;
        name = b;
        branch = c;
        phone = d;
    }

    void print() {
        System.out.println("USN: " + usn + "\nName: " + name + "\nBranch: " + branch + "\nPhone: " + phone);
    }   
}

public class Student {
    public static void main(String[] args) {
        StudentDetails s[] = new StudentDetails[100];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            s[i] = new StudentDetails();
        }
        for(int i = 0; i < n; i++) {
            System.out.println("enter the usn, name, branch, phone: ");
            int USN = sc.nextInt();    
            String Name = sc.next();    
            String branch = sc.next();     
            int phone = sc.nextInt();
            s[i].insert(USN, Name, branch, phone);
        }
        for(int i = 0; i < n; i++) {
            s[i].print();
        }
        sc.close();
    }
}
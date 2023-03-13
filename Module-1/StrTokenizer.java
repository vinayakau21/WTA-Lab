import java.util.*;

public class StrTokenizer {
    public static void main(String[] args) {
        System.out.println("Enter employee details in the order ID, Name, Salary");
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        StringTokenizer st = new StringTokenizer(txt," ");
        System.out.println("Employee details are(id, name, salary): ");
        System.out.println("Employee ID: "+ st.nextToken());
        System.out.println("Employee Name: "+ st.nextToken());
        System.out.println("Employee Salary: "+ st.nextToken());
        sc.close();
    }
} 

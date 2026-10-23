
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            String name = sc.next();
            students.put(roll, name);
        }

        System.out.println(n + " records added");
        System.out.println("Student Records: " + students);

        int searchRoll = sc.nextInt();

        if (students.containsKey(searchRoll)) {
            System.out.println("Found: " + students.get(searchRoll));
        } else {
            System.out.println("Roll number not found");
        }
    }
}

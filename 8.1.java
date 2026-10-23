
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String task = sc.nextLine();
            tasks.add(task);
        }

        System.out.println(n + " tasks added");
        System.out.println("Tasks: " + tasks);
        System.out.println("Total tasks = " + tasks.size());

        String removeTask = sc.nextLine();

        if (tasks.remove(removeTask)) {
            System.out.println("Task removed successfully");
            System.out.println("Total tasks = " + tasks.size());
        } else {
            System.out.println("Task not found");
        }
    }
}

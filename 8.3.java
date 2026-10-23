
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextLine());
        }

        System.out.println("Actions stack (top to bottom): " + stack.reversed());

        int undo = sc.nextInt();

        for (int i = 0; i < undo; i++) {
            if (stack.isEmpty()) {
                System.out.println("No actions left to undo");
            } else {
                System.out.println("Undo: " + stack.pop() + " removed");
            }
        }

        System.out.println("Stack now: " + stack);
    }
}

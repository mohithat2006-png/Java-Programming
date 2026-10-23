
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.add(sc.next());
        }

        System.out.println("Queue = " + queue);

        if (sc.hasNext()) {
            String operation = sc.next();

            if (operation.equals("process")) {
                if (queue.isEmpty()) {
                    System.out.println("No job in queue to print");
                } else {
                    System.out.println(queue.poll() + " printed and removed");
                    System.out.println("Queue = " + queue);
                }
            }
        }
    }
}

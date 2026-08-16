import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();
        String keyword = sc.nextLine();

        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
        }
        else if (feedback.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword Found");
        }
        else {
            System.out.println("Keyword Not Found");
        }
    }
}
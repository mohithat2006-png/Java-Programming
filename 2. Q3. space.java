import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();

        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
        }
        else {
            String[] words = feedback.split(" ");

            System.out.println("Words = " + words.length);
        }
    }
}
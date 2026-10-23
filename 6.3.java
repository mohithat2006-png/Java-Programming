import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Invalid Age Exception");
            }
            System.out.println("Eligible to Vote");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

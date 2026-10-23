import java.util.Scanner;

class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();

        try {
            if (balance < 1000) {
                throw new LowBalanceException("LowBalanceException");
            }

            System.out.println("Valid Balance");
        }
        catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

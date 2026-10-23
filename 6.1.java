import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            if (num == 0) {
                throw new ArithmeticException();
            }
            double reciprocal = 1.0 / num;
            System.out.println("Reciprocal = " + reciprocal);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int A = 0, B = 0, C = 0, D = 0, F = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            int marks = sc.nextInt();
            total = total + marks;

            if (marks >= 90) {
                System.out.print("A ");
                A++;
            }
            else if (marks >= 80) {
                System.out.print("B ");
                B++;
            }
            else if (marks >= 70) {
                System.out.print("C ");
                C++;
            }
            else if (marks >= 60) {
                System.out.print("D ");
                D++;
            }
            else {
                System.out.print("F ");
                F++;
            }
        }

        System.out.println();
        System.out.println("A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", F=" + F);
        System.out.println("Average = " + ((double) total / n));
    }
}
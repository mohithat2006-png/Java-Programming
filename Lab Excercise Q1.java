import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int employeeId = sc.nextInt();
        String employeeName = sc.next();

        int[] attendance = new int[7];
        int presentDays = 0;
        int absentDays = 0;

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();

            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Attendance Input");
                return;
            }

            if (attendance[i] == 1) {
                presentDays++;
            } else {
                absentDays++;
            }
        }

        double percentage = (presentDays / 7.0) * 100;

        System.out.printf("Attendance = %.2f%%, Absent Days = %d, ",
                percentage, absentDays);

        if (percentage >= 90) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
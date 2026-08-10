import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < N; i++) {

            if (current + nums[i] > nums[i])
                current = current + nums[i];
            else
                current = nums[i];

            if (current > max)
                max = current;
        }

        System.out.println(max);
    }
}
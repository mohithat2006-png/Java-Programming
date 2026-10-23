import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int index=sc.nextInt();
        int[] arr=new int[n];
        try {
            int element=arr[index];
            System.out.println("Element Displayed Successfully");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        sc.close();
    }
}

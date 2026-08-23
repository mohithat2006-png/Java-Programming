import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            int n=s.nextInt();
            double reciprocal=1.0/n;
            if(n==0){
                throw new ArithmeticException();
            }
            System.out.println("Reciprocal=" + reciprocal);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        s.close();
    }
}
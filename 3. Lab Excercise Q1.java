import java.util.Scanner;
class LowBalanceException extends Exception{
    public LowBalanceException(String message){
        super(message);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter balance=");
        double balance=s.nextDouble();
        try{
            if(balance < 1000){
                throw new LowBalanceException("LowBalanceException");
            }
            System.out.println("Valid Balance");
        }catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
        s.close();
    }
}
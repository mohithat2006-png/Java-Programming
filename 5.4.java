import java.util.Scanner;
interface Payment{
    void makePayment();
}
class UPI implements Payment{
    public void makePayment(){
        System.out.println("Payment Successful");
    }
}
class CreditCard implements Payment{
    public void makePayment(){
        System.out.println("Payment Successful");
    }
}
class DebitCard implements Payment{
    public void makePayment(){
        System.out.println("Payment Successful");
    }
}
class NetBanking implements Payment{
    public void makePayment(){
        System.out.println("Payment Successful");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mode=sc.nextLine();
        Payment payment=null;
        if(mode.equalsIgnoreCase("UPI")){
            payment=new UPI();
        } 
        else if(mode.equalsIgnoreCase("Credit Card")){
            payment=new CreditCard();
        } 
        else if(mode.equalsIgnoreCase("Debit Card")) {
            payment=new DebitCard();
        } 
        else if(mode.equalsIgnoreCase("Net Banking")) {
            payment=new NetBanking();
        } 
        else{
            System.out.println("Invalid Payment Mode");
        }
        if(payment!=null){
            payment.makePayment();
        }
        sc.close();
    }
}
import java.util.Scanner;

class Product{
    String productId;
    String productName;
    double price;
    Product(String productId, String productName, double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    void displayProduct(){
        if (price <= 0) {
            System.out.println("Invalid Product Price");
        } else {
            System.out.println("Product Details");
            System.out.println("Product ID:"+productId);
            System.out.println("Product Name:"+productName);
            System.out.println("Price:"+price);
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String productId=sc.next();
        String productName=sc.next();
        double price=sc.nextDouble();
        Product p=new Product(productId, productName, price);
        p.displayProduct();
        sc.close();
    }
}
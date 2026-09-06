import java.util.Scanner;
class Product{
    String productId;
    String productName;
    double price;
    Product(String productId,String productName,double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    void displayCategory(){
        System.out.println("Product Details");
    }
}
class Electronics extends Product{
    Electronics(String productId, String productName, double price) {
        super(productId, productName, price);
    }
    @Override
    void displayCategory(){
        System.out.println("Electronics Product Displayed");
    }
}
class HomeAppliance extends Product{
    HomeAppliance(String productId, String productName, double price) {
        super(productId, productName, price);
    }
    @Override
    void displayCategory(){
        System.out.println("Home Appliance Product Displayed");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String category=sc.next();
        String productName=sc.next();
        double price=1000; 
        if(sc.hasNextDouble()){
            price=sc.nextDouble();
        }
        if(price<=0){
            System.out.println("Invalid Product Price");
        } 
        else if(category.equalsIgnoreCase("Electronics")){
            Product p=new Electronics("P101",productName,price);
            p.displayCategory();
        } 
        else if(category.equalsIgnoreCase("Home")) {
            sc.nextLine(); 
            Product p=new HomeAppliance("P102",productName,price);
            p.displayCategory();
        }
        sc.close();
    }
}
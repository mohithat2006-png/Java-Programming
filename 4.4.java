import java.util.Scanner;
class Product{
    private int id;
    private double price;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    void display(){
        System.out.println("Product Details Displayed");
        System.out.println("Product ID:"+id);
        System.out.println("Product Price:"+price);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int id=s.nextInt();
        double price=s.nextDouble();
        Product p=new Product();
        p.setId(id);
        p.setPrice(price);
        System.out.println("Product Record Created");
        p.display();
        s.close();
    }
}
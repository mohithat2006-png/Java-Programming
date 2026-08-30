import java.util.Scanner;
class Employee{
    int id;
    String name;
    void updateDetails(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Employee Record Updated");
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int id=s.nextInt();
        String name=s.next();
        Employee e=new Employee();
        e.updateDetails(id,name);
        e.display();
        s.close();
    }
}
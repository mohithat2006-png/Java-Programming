import java.util.Scanner;
class Student{
    String name;
    static String collegeName="Alliance University";
    Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Student:"+name);
        System.out.println("College Name:"+collegeName);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        Student p=new Student(name);
        p.display();
        s.close();
    }
}
import java.util.Scanner;
class Student{
    int studentId;
    String name;
    double cgpa;
    Student(int studentId,String name,double cgpa) {
        this.studentId=studentId;
        this.name=name;
        this.cgpa=cgpa;
    }
    void display(){
        System.out.println("Student Details");
        System.out.println("Student ID:"+studentId);
        System.out.println("Name:"+name);
        System.out.println("CGPA:"+cgpa);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.next();
        double cgpa=sc.nextDouble();
        Student s=new Student(id,name,cgpa);
        s.display();
        sc.close();
    }
}
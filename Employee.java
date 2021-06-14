import java.util.Scanner;
public class Employee
{
 String empid;
 String name;
 int salary;
 String address;
 Employee()
 {
 empid=" ";
 name=" ";
 salary=0;
 address=" ";
 }
 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter empid");
 empid=sc.nextLine();
 System.out.println("Enter name");
 name=sc.nextLine();
 System.out.println("Enter salary");
 salary=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("\n\nId : "+empid);
 System.out.println("Name :"+name);
 System.out.println("Salary :"+salary);
 System.out.println("Address :"+address);
 }
}

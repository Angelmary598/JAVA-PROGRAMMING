import java.util.Scanner;
public class Teacher extends Employee
{
 String dept;
 String subject;
 Teacher()
 {
 dept="";
 subject="";
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter dept name");
 dept=sc.nextLine();
 System.out.println("Enter subject name");
 subject=sc.nextLine();
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject taught :"+subject);
 }
}

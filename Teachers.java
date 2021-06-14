import java.util.Scanner;
public class Teachers extends Employe
{
 String Dept;
 String subject;
 String TeacherID;
 Teachers()
 {
 Dept="MCA ";
 subject ="Java";
 TeacherID="";
 }
 void read()
 {
	 super.read();
 System.out.println("teacher read");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Dept.Name" );
 Dept=sc.nextLine();
 System.out.println("Enter Subject");
 subject=sc.nextLine();
 System.out.println("Teacher Id" );
 TeacherID=sc.nextLine();
 }

 void display() {
 super.display();
 System.out.println("Department :"+Dept);
 System.out.println("Subject :" +subject);
 System.out.println("Teacher ID :"+TeacherID);
 }
}
import java.util.Scanner;
public class Person
{
 String name;
 String gender;
 String address;
 int age;
Person( )
{
 name=" ";
 gender="";
 address="";
 age=0;
}
void read()
 {
 System.out.println("person read");
 Scanner sc=new Scanner(System.in);
 System.out.println(" Enter Name" );
 name=sc.nextLine();
 System.out.println("Enter Male/Female");
 gender=sc.nextLine();
 System.out.println(" Enter address" );
 address=sc.nextLine();
 System.out.println(" Enter age" );
 age=sc.nextInt();
 
 }
 void display()
{
 System.out.println("\n\nName of Person :"+name);
 System.out.println("Gender :"+gender);
 System.out.println("Address :"+address);
 System.out.println("Age :"+age);
}
}

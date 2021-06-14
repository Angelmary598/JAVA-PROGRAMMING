import java.util.Scanner;
public class Employe extends Person {
 String EmpID;
 String companyname;
 String Qualification;
 int salary;
 Employe()
 {
 EmpID=" ";
 companyname=" ";
 Qualification=" ";
 salary =10000;
 }
 void read()
 {
	 super.read();
 System.out.println("employee read");
 Scanner sc=new Scanner(System.in);
 System.out.println(" Enter EmpID" );
 EmpID=sc.nextLine();
 System.out.println("Enter Company Name");
 companyname=sc.nextLine();
 System.out.println(" Enter Qualification" );
 Qualification=sc.nextLine();
 System.out.println(" Enter Salary" );
 salary=sc.nextInt();
 
 }
 void display()
 {
 super.display();
 System.out.println("EmpID :" +EmpID);
 System.out.println("Company Name :"+companyname);
 System.out.println("Salary :" +salary);
 System.out.println("Qualification :" +Qualification);
}}
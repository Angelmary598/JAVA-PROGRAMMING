import java.util.Scanner;
public class TeacherDetail {
 public static void main(String args[])
 {
	 int n;
 System.out.println("Enter the no. of teachers:");
 Scanner sc= new Scanner(System.in);
 n=sc.nextInt();
 Teacher t[]=new Teacher[n];
 for (int i=0; i<n; i++)
 {
 t[i]=new Teacher();
 t[i].read();
 }
 for (int i=0; i<n; i++)
 {
 t[i].display();
 }
 }
}
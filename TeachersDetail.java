import java.util.Scanner;
public class TeachersDetail {
 public static void main(String args[]) {
 Scanner s = new Scanner(System.in);
 System.out.println(" Enter a value for n ");
 int n = s.nextInt();
 Teachers t[] = new Teachers[n];
 for (int i = 0; i < n; i++) {
 t[i] = new Teachers();
 t[i].read();
 }
 for (int j = 0; j < n; j++) {
 t[j].display();
 }
 }
}
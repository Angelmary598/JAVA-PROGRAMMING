import java.util.Scanner;
class publisher
{
 String name;
 String loc;
 String ISBN_no;
void read()
{
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter name of publisher:");
 name=sc.nextLine();
 System.out.println(" Enter the location:");
 loc=sc.nextLine();
 System.out.println(" Enter the ISBN number:");
 ISBN_no=sc.nextLine();
}
}
class book extends publisher
{
String author;
String title;
int price;
String category;
void read()
{
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter name of author:");
 author=sc.nextLine();
 System.out.println(" Enter the Title of the book:");
 title=sc.nextLine();
 System.out.println(" Enter the category of book:");
 category=sc.nextLine();
 System.out.println(" Enter the price of book:");
 price=sc.nextInt();
}
void display()
{
 
 System.out.println("Book title : "+title);
 System.out.println(" The book author :"+author);
 System.out.println("The category of book :"+category);
 System.out.println("Publisher:"+name);
 System.out.println("Place :"+loc);
 System.out.println("ISBN No:"+ISBN_no);
}
}
class BookInheritDemo
{
 public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
  System.out.println("No. of books to enter:");
  int n=sc.nextInt();
   book b[]=new book[n];
   for (int i=0; i<n; i++)
   {
    b[i]=new book();
    b[i].read();
    }
	for (int j = 0; j < n; j++) {
 b[j].display();
 }
  }
}
import java.io.*;
class SearchDemo
{  
 public static void main(String args[]) throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int i,n,s,temp=0;
   System.out.println("Enter the number of elements:") ;
   n = Integer.parseInt(br.readLine());
   int[] arr = new int[n];
   System.out.println("Enter the elements") ;
   for(i=0;i<n;i++)
   {
     arr[i] = Integer.parseInt(br.readLine());
   }
   System.out.println("Enter the element to be searched");
   s = Integer.parseInt(br.readLine());
   for(i=0;i<n;i++)
   {
    if(arr[i]==s)
       {
          System.out.println("Element found");
          temp=1;
           break;
        }
   }
  if(temp==0)
   {
     System.out.println("Element not found");
    }
 }
}
import java.io.*;
class MatrixAddDemo
{
    public static void main(String args[]) throws IOException
	{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int i, j, p, q;
		  System.out.println("Enter the number of rows:");
		  p = Integer.parseInt(br.readLine());
		  System.out.println("Enter the number of columns:");
		  q = Integer.parseInt(br.readLine());
		  
		  if(p!=q)
		  {
			  System.out.println("Make sure the matrix is Square Matrix!!");
		  }
		  else
		  {
		    int m1[][]  = new int[p][q];
		    int m2[][]  = new int[p][q];
			int add[][]  = new int[p][q];
		    
			
			System.out.println("Enter the first matrix:");
		     for (i = 0; i < p; i++) 
		     {
			    for (j = 0; j < q; j++) 
			    {
				 m1[i][j] = Integer.parseInt(br.readLine());
                }
				System.out.println();
              }
			System.out.println("Enter the second matrix:");
		     for (i = 0; i < p; i++) 
		     {
			    for (j = 0; j < q; j++) 
			    {
				 m2[i][j] = Integer.parseInt(br.readLine());
                }
				System.out.println();
              }
			MatrixAdd c=new MatrixAdd();
			System.out.println("The first matrix is: ");
		     c.Display(m1,p,q);
			 System.out.println("The second matrix is: ");
			 c.Display(m2,p,q);
		     c.matrixAdd(add,m1,m2,p,q);
			 System.out.println("The added matrix is: ");
			 c.Display(add,p,q);
		  }
	}
}
class MatrixAdd
{
	void Display(int m[][],int p,int q) throws IOException
	{
		int i,j;
		
		for (i = 0; i < p; i++) 
		{
			for (j = 0; j < q; j++) 
			{
				    System.out.print(m[i][j] + "\t");
            }
			     System.out.println("");
        }
	}
	void matrixAdd(int add[][],int m1[][],int m2[][],int p,int q) throws IOException
    {
		
		int i,j;
		for ( i= 0 ; i < p ; i++ )
           for ( j= 0 ; j < q ;j++ )
                add[i][j] = m1[i][j] + m2[i][j] ; 
	}
}
 
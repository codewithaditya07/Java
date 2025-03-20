import java.util.Scanner;

public class JavaApplz {
    
    public static void main(String[] args) 
    {
   Scanner sc=new Scanner(System.in); 
   //Create 3x3 Matrix
   int a[][]=new int[3][3];
   int b[][]=new int[3][3];
   int c[][]=new int[3][3];
   int x,y;
   
   //insert Data Into First Matric
   
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       System.out.println("Enter Elemets in First Matrix:- ");
       a[x][y]=sc.nextInt();
   }
   
   }
   
   //insert Data Into 2nd Matric
   
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       System.out.println("Enter Elemets in 2nd Matrix:- ");
       b[x][y]=sc.nextInt();
   }
   
   }
   
   
//Addition of  Matric
   
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       c[x][y]=a[x][y]+b[x][y];
   }
   
   }
   
   //First Matrix
   System.out.println("Your First Matrix");
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       System.out.print(a[x][y]+" ");
   }
   System.out.println("");
   
   }
  
   
   //2nd Matrix
   System.out.println("Your Second Matrix");
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       System.out.print(b[x][y]+" ");
   }
   System.out.println("");
   
   }
  
   
   //Final Matrix
   System.out.println("Your Final Matrix");
   for(x=0;x<3;x++)
   {
   for(y=0;y<3;y++)
   {
       System.out.print(c[x][y]+" ");
   }
   System.out.println("");
   
    }  

   }

}
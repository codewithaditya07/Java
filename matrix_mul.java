import java.util.Scanner;

public class matrix_mul{
    

      public static void main(String[] args) 
    {
        //Matrix Multipication
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        
      Scanner sc=new Scanner(System.in);
      int x,y,z,s=0;
      //Insert Data into First array:-
      for(x=0;x<3;x++)
      {
      for(y=0;y<3;y++)
      {
          System.out.println("Enter Elements in First Array:- ");
          a[x][y]=sc.nextInt();
      
      }
      
      }
      
      
      //Insert Data into Second array:-
      for(x=0;x<3;x++)
      {
      for(y=0;y<3;y++)
      {
          System.out.println("Enter Elements in Second Array:- ");
          b[x][y]=sc.nextInt();
      }
      }

      //Multiply in Array:-
      
      for(x=0;x<3;x++)
      {
      
      for(y=0;y<3;y++)
      {
      s=0;
      for(z=0;z<3;z++)
      {
      s=s+a[x][z]*b[z][y];
      
      }
      c[x][y]=s;
      
      }
      }
   
        System.out.println("First Matrix");
      
      for(x=0;x<3;x++)
      {
      for(y=0;y<3;y++)
      {
          System.out.print(a[x][y]+" ");
        
      }
          System.out.println("");
      }
      
       System.out.println("Second Matrix");
      
      for(x=0;x<3;x++)
      {
      for(y=0;y<3;y++)
      {
          System.out.print(b[x][y]+" ");
        
      }
          System.out.println("");
      }
      
      
       System.out.println("Final Matrix");
      
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

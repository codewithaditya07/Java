//2D Array
// import java.util.Scanner;

// public class Two_D_Array {
//     public static void main(String[] args) 
//     {
//      Scanner sc =new Scanner(System.in);   
//       //What is 2D Array
//       int a[][]=new int[3][3];  
//       int x,y;
      
//       for(x=0;x<3;x++)
//       {
      
//       for(y=0;y<3;y++)
//       {
//           System.out.println("Enter Elements is Array:- ");
//           a[x][y]=sc.nextInt();
      
//       }
      
//       }
      
//       for(x=0;x<3;x++)
//       {
      
//       for(y=0;y<3;y++)
//       {
//           System.out.print(a[x][y]+" ");
               
//       }
//           System.out.println("\n");
//       }
      
      
      
//     }
    
// }

import java.util.Scanner;


public class Two_D_Array {

    public static void main(String[] args) 
    {
     Scanner sc =new Scanner(System.in);   
      //What is 2D Array
      int a[]=new int[6];  
      int x,y;
      
    
      
      for(y=0;y<6;y++)
      {
          System.out.println("Enter Elements is Array:- ");
          a[y]=sc.nextInt();
      
      }
      
      
      
      for(x=0;x<6;x++)
      {
      
      
          System.out.print(a[x]+",");
   
      }
      
        System.out.println("\nReverse");
       for(x=0;x<6;x++)
      {
      
      
          System.out.print(a[6-x-1]+",");
   
      }
      
      
    }
    
}
// class car{
//     void tyre(){

//         for(int x = 1;x <=5 ;x++){
//             for(int y = 1; y <=x ;y++){
//                 System.err.print("*");

//             }
//             System.out.println("");
//         }
//     }

// }
// public class OOPS {
//     public static void main(String[] args) {
//         car ob = new car();
//         ob.tyre();
//     }
// }
import java.util.Scanner;
class ansh{

    void array(){
        
      int[] var1 = new int[10];
      Scanner sc = new Scanner(System.in);

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         System.out.println("Enter array");
         var1[var2] = sc.nextInt();
      }

      System.out.println(" your array ");

      for(var2 = 0; var2 < 10; ++var2) {
         System.out.print(var1[var2] + ",");
      }

      System.out.println("\nEven Number:- ");

      for(var2 = 0; var2 < 10; ++var2) {
         if (var1[var2] % 2 == 0) {
            System.out.print(var1[var2] + ",");
         }
      }

      System.out.println("\nOdd Number:- ");

      for(var2 = 0; var2 < 10; ++var2) {
         if (var1[var2] % 2 == 1) {
            System.out.print(var1[var2] + ",");
         }
         
      }

   }


   void nested() 
   {
    Scanner sc = new Scanner (System.in);

    System.out.println("\nEnter A Element");
    int a = sc.nextInt();
    
    System.out.println("Enter B Element");
    int b = sc.nextInt();
    
    System.out.println("Enter C Element");
    int c = sc.nextInt();
    
       if(a>b)
       {
        if (a>c){
    
        System.out.println("A is largest");
       }
    else
    if (b >a){
        System.out.println("B is largest");
    }
    else{
        System.out.println("C is lagest ");
    }
        }
    else
     if(b >c){
    System.out.println("B is largest");
    }
    else 
    {
        System.out.println("C is largest");
    }
    sc.close();
        }
        
    }
    

 //main class
class OOPS {
    public static void main(String[] args) {

        ansh ob =new ansh();
        ob.array();
        ob.nested();

        
    }
}
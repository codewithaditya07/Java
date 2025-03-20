//Q1.print number 1 to 20 by using for loop 

// public class for_loop {

//     public static void main (String [] args){
//          int x;
//          for(x = 1 ;x <=20;x++){
//           System.out.println(x);
//          }
//     }

// }

//Q2. print even number from 1 to 20 using for loop

// class for_loop {
//     public static void main(String[] args) {
//         //int x;
//         for (int x = 1; x <= 20; x++) {

//             if (x % 2 == 0) {
//                 System.out.println(x);
//             }
//         }
//     }

// }

//Q3.Print All Odd Number Between 1 to 30       

// public class for_loop {

//     public static void main(String[] args) {
//         int x = 1;
//         for(x = 1;x <= 30;x++){
//             if(x%3 ==0){
//                 System.out.println(x);
//             }
//         }
//     }
// }

// Q4.Input any value and check its prime or Not.
// import java.util.Scanner;

// public class for_loop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("input any value");
//         int z = sc.nextInt();

//         int a, f = 0;
//         for (a=2; a<=z/2; a++) {
//             if (z%a == 0) {
//                 f = 1;
//             }
//         }
//             if (f == 0) {

//                 System.out.println("prime");
                
//             } 

//               else {
//                 System.out.println("not prime");
//             }

        
//         sc.close();
//     }
// }

//Q5.Print all ASCII values and their corresponding characters.


// class for_loop{
//     public static void main(String[] args) {
//         for(int a = 97; a <=122; a++){
//         System.out.printf("%c",a);}
//     }

// }

//Q6.Print numbers divisible by 3 or 5 in a range.
// import java.util.Scanner;

// class for_loop{
//      public static void main (String[]args){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Start number");
//         int a = sc.nextInt();

//         System.out.println("End number");
//         int b = sc.nextInt();

//         for(int i = a;i <= b ;i++){

//             if (i%3 == 0 || i%5 ==0){
//                 System.out.println(i);

//             }
//         }
//      }
// }

// Q7.Print the sum of every second digit of a number.

// Q8.Input Number from the Keyboard and Print The Tables.
// import java.util.Scanner;
// class for_loop{

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         System.out.println("Input Number");
//         int a =sc.nextInt();

//         for(int i = 1; i <=10;i++){
           
//             System.out.println(i*a);
          

//         }
//     }
// }

// Q9.Calculate the power of a number without using pow().
//  class for_loop{
//     public static void main(String[] args) {
//         double k=5;
//         for(int i  = 0 ; i<=5;i++)
//         {
//         k=k*k;

//         System.out.println(k);
//         }
//     }
//  }
// Q10.Print Factorial of Any Number
// import java.util.Scanner;
// class for_loop{

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         int a,i,f = 1;

//         System.out.println("Input Number");
//          a=sc.nextInt();
          
//         for(i = a; i > 0;i--){
           
//             System.out.printf("%d *",i);

//             f = f*i;
        
//         }
//         System.out.printf("= %d",f);
//     }
// }

// Q11.Print Fibonacci Series for nth position
// import java.util.Scanner;

// class for_loop{

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a,b,x,y,z;
//         a =0;
//         b = 1;

//         System.out.println("Input Number");
//          x =sc.nextInt();

//         System.out.printf("%d ," , a);
        

//         System.out.printf("%d ," , b);
  
//       for (y=3;y<=x;y++)
//     {
//         z=a;
//         a=b;
//         b=z+a;
//         System.out.printf("%d ,",b);
    
//     }

// }

//         }
    


// Q12.Print Reverse Number
import java.util.Scanner;
class for_loop{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, y, r, s = 0;

    System.out.println("enter number");
      x = sc.nextInt();

      for(y=x;y>0;){
    
        r = y % 10;
        s = s * 10 + r;
        y = y / 10;
      }

        System.out.printf("%d",s);
    
    sc.close();
        
    }
}

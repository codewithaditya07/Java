// if else questions

//Q1 Write a Program to Check if a Number is Positive, Negative
// import java.util.Scanner;

// class question {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//       System.out.println("enter the number ");
//       int number = sc.nextInt();

//       if (number > 0)
//        {
//         System.out.println(" is positive.");
//     } 
//     else if (number < 0)
//     {
//         System.out.println(" is negative.");
//     } 
//     else 
//     {
//         System.out.println("The number is zero.");
//     }
//     }

// }

// Q2 Write a Program to Check if a Number is Odd or Even
// import java.util.Scanner;
// class question
// {
//     public static void  main(String[] args){
//     Scanner sc = new Scanner (System.in);

//     System.out.println("enter your number");
//      int num = sc.nextInt();

//      if (num%2==0 )
//      System.out.println(" it is even number");
//      else{

//         System.out.println("it is odd number");
//      }

//     }
// }

//Q3 Write a Program to Check Leap Year

// import java.util.Scanner;
//  class question
//  {
//     public static void main(String []args ){
//         Scanner sc= new Scanner(System.in);

//     System.out.println("Enter the year");
//     int year = sc.nextInt();

//     if(year%100==0)
//     {
//         if(year%400==0)
//         {
//             System.out.println("Leap Year");
//         }
//         else
//         {
//             System.out.println("Not Leap year");
//         }
//     }
//     else
//     {

//         if(year%4==0)
//         {
//             System.out.println("Leap Year");
//         }
//         else
//         {
//             System.out.println("Not Leap year");
//         }

//     }
//     }
//  }

//Q4 Write a Program to Find the Largest Among Three Numbers

// import java.util.Scanner;

// class question {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//      System.out.println("Enter first number");
//      int a = sc.nextInt();

//      System.out.println("Enter second number");
//      int b = sc.nextInt();

//      System.out.println("Enter three number");
//      int c = sc.nextInt();

//      if (a > b)
//      {

//       if(a > c ) {

//         System.out.println(" A IS LARGEST NUMBER");

//         }
//         else
//             if (b > a ){
//             System.out.println(" B IS LARGEST NUMBER");
//         }
//         else{
//             System.out.println(" C IS LARGEST NUMBER");
//         }
//     }
//         else
//             if (b > c){
//             System.out.println(" B IS LARGEST NUMBER");
//         }
//         else{
//             System.out.println(" C IS LARGEST NUMBER");

//      }
//     }
// }

//Q5 Write a Program to create a Marksheet and Find Total, Percentage and Grade, Grade will be following
// If Per>=50 and <60 E and >=60 and <70 Then D and >=70 and <80 C, >=80 and <90,B, and >=90 and <=100 A otherwise Fail

// import java.util.Scanner;

// class question {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int x, y,a,b, per, total;
//         System.out.println("enter first number");
//         x = sc.nextInt();

//         System.out.println("enter second number");
//         y = sc.nextInt();

//         System.out.println("enter third number");
//         a = sc.nextInt();

//         System.out.println("enter fourth number");
//         b = sc.nextInt();

//         total = x + y + a + b ;
//         System.out.println("the sum");
//         System.out.println(total);

//         per = total / 4;
//         System.out.println(per);

//         if (per >= 50 && per < 60) {
//             System.out.println("E Grade");
//         }
//     else
//         if (per >= 60 && per < 70) {
//             System.out.println("D Grade");
//         }
//     else
//         if (per >= 70 && per < 80) {
//             System.out.println("C Grade");
//         }
//     else
//         if (per >= 80 && per < 90) {
//             System.out.println("B Grade");
//         }
//     else        
//         if (per >= 90 && per < 100) {
//             System.out.println("A Grade");

//         } else {
//             System.out.println("fail");
//         }
//     }
// }

// Q7.Input 4 Numbers by keyboard and Find Smallest one.
import java.util.Scanner;

class question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter three number");
        int c = sc.nextInt();

        System.out.println("Enter fouth number ");
        int d = sc.nextInt();

        if (a < b && a < c && a < d) {
            System.out.println("A IS SMALLL");

        }
         else if (b < c && b < d) {
            System.out.println("B IS SMALLL");
        }
         else if (c < d) {
            System.out.println(" C IS SMALLL");
        }

        else {
            System.out.println("D IS SMALLL");
        }
        sc.close();
    }

}

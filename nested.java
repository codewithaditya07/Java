//nested number

import java.util.Scanner;
class nested {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

System.out.println("Enter A Element");
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

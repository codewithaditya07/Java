// public class ExceptionHandling {

//     public static void main(String[] args) {
//         int a = 1;
//         int b = 1;
//     try

//    {
//     System.out.println(a/b);//Arithmatic
    
//     int k[]=new int[3];//Array outofbount

//     k[2]=30;

//     System.out.println(k[2]);

//     int s=19;

//     if(s>9)
//     {
//      throw new IllegalArgumentException("Age must be less then 10"); 
    
//     } 
//    }
//   catch(ArithmeticException e)
//     {
//     System.out.println("Not Divided by 0"+e);
//     }
//   catch (ArrayIndexOutOfBoundsException k)
//   {
//       System.out.println("Array is Out of Bound "+k);
//   }
   
//   catch(IllegalArgumentException e)
//   {
//       System.out.println(e);
//   }
   
//  }
// }

// class TH extends Thread
// {

//   public void run()
//   {
//       try
//       {
//      for(int x=1;x<=10;x++)
//      {
//          System.out.println(x);
//          Thread.sleep(1000);
//           System.out.println(11-x);
//          Thread.sleep(3000);
//      }
//       }
//       catch(Exception e)
//       {
      
//       }
//   }

// }

// public class ExceptionHandling {

//    public static void main(String[] args) {

//     TH ob = new TH();
//     ob.start();
//    }
// }


class x extends Thread
{
public void run()
{
try
{
    for(int x=1;x<=10;x++)
    {
        System.out.println(x);
        Thread.sleep(1000*x);
    }
    
}
catch(Exception i)
{

}
}
}

class ExceptionHandling{
  public static void main(String[] args) 
{
 
    Thread the=new Thread(new x());
    the.start();
    
}
}
public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
    try

   {
    System.out.println(a/b);//Arithmatic
    
    int k[]=new int[3];//Array outofbount

    k[2]=30;

    System.out.println(k[2]);

    int s=19;

    if(s>9)
    {
     throw new IllegalArgumentException("Age must be less then 10"); 
    
    } 
   }
  catch(ArithmeticException e)
    {
    System.out.println("Not Divided by 0"+e);
    }
  catch (ArrayIndexOutOfBoundsException k)
  {
      System.out.println("Array is Out of Bound "+k);
  }
   
  catch(IllegalArgumentException e)
  {
      System.out.println(e);
  }
   
 }
}


abstract class Build
{
abstract void House(int a);
}

class BD extends Build
{
    
void House(int a)
{
    System.out.println(a*a);
}
   
}

class T1 extends Build
{
void House(int a)
{
    System.out.println(a*a*a);
}
}

public class Abstract {

    public static void main(String[] args)
    {
BD ob=new BD();
ob.House(9);
T1 ob1=new T1();
ob1.House(8);


    }
    
}

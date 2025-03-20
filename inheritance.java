// // single inheritance
// class parents{
//     void parentsclass(){
//         System.out.println("hello i am parents class");
//     }
// }
// class child extends parents{
//     void child1(){
//         System.out.println("hello i am child class");
//     }
// }

// class child2 extends parents {
//     void child2class(){
//         System.out.println("hello i am child2 class");
//     }
// }
// public class inheritance {
//     public static void main(String[] args) {
//         child ob = new child();
//         ob.child1();
//         ob.parentsclass();
        
//         child2 ob1 = new child2();
//         ob1.child2class();
//     }
    
// }

//multilevel inheritance
class grandparents
{
    
void parents()
{

    System.out.println("Hello I am grand Parents");
}

}


class pp extends grandparents 
{

void child_gp()
{

    System.out.println("Hi, I am parents");

}


}

class child extends pp 
{

void child_1()
{

    System.out.println("Hi, I am Child");

}


}

public class inheritance {

static public  void main(String[] args) 
    {
  child ob=new child();
  ob.child_1();
  ob.child_gp();
  ob.parents();

     }
    
}
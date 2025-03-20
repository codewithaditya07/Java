// //function overloading
// class shop{
//     void namkeen(){
//         System.out.println("it is namkeen price is zero ");
//     }

//     void namkeen(String name){
//         System.out.println("it is namkeen name is "+ name);

//     }

//     void namkeen(String name,int price ){
//         System.out.println("it is namkeen name is "+name+" and its price is "+price);
//     }
// }
// public class polymorphism {
//        public static void main(String[] args) {
        
       
//     shop ob = new shop();
//     ob.namkeen();
//     ob.namkeen("mixture");
//     ob.namkeen("mixture",50);
  
//     }

// }


//constructor overloading
// class shop{
//     shop(){
//         System.out.println("it is namkeen price is zero ");
//     }

//     shop(String name){
//         System.out.println("it is namkeen name is "+ name);

//     }

//     shop(String name,int price ){
//         System.out.println("it is namkeen name is "+name+" and its price is "+price);
//     }
// }


// public class polymorphism {
//        public static void main(String[] args) {
        
//     // shop sp=new shop();   
//     // shop ob = new shop( "mixture",50);

//     shop ob = new shop();
//     shop ob1 = new shop("mixture");
//     shop ob2 = new shop("mixture",50);
  

//     }

// }

//Method Overriding

class shop
{
void rice()
{

    System.out.println("Hi, i am in shop");
}


}

class wheat extends shop
{

void rice()
{

    System.out.println("rice class");
}

}


public class polymorphism {

static public  void main(String[] args) 
    {

        shop ob = new shop();
        ob.rice();
        
        wheat ob1=new wheat();
        ob1.rice();

    }
    
}
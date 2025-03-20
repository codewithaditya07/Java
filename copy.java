// // this keyword
// class rice
// {
//     private int a,b,k;

// rice(int a ,int b){
//     this.a=a;
//     this.b=b;
// }
// void wheat(){
//     this.k=this.a+this.b;

// }
// void aa()
// {
//     System.out.println(this.k);
// }
// }

// public class copy {
//     public static void main(String[] args) {
//         rice ob = new rice(10,30);
//         ob.wheat();
//         ob.aa();
    
//     }
// }

// copy constructor
class rice
{
    private int a,b,k;

rice(int a ,int b){
    this.a=a;
    this.b=b;
}
void wheat(){
    this.k=this.a+this.b;

}
void aa()
{
    System.out.println(this.k);
}
// copy
rice(rice ob){
    System.out.println(ob.a+ob.b);
}
}

public class copy {
    public static void main(String[] args) {
        rice ob = new rice(10,30);
        rice ob1 = new rice(ob);
    
    }
}

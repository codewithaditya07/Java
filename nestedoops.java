class vote{

    class man {

     class woman
     {
        void shristi(){

            System.out.println("shristi:- hello i am momo");
        }
     }

     void aniket(){

        System.out.println("aniket:- hello i am momo friend");
     }
     void vansh(){

        System.out.println("vansh:- mujhe babu chahiye");
     }    

    }
}

public class nestedoops {
    public static void main(String[] args) {
         vote ob =new vote();
         vote.man ob1 = ob.new man();
         ob1.vansh();
         ob1.aniket();
         vote.man.woman ob2 = ob1.new woman();
         ob2.shristi();
         

    }
    
}

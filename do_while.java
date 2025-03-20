//print number 1 to 20 by using do while loop

// public class do_while {
//     public static void main(String[] args) {
//         int x = 1;
//         do{
//             System.out.println(x);
//             x++;
//         } 
//         while(x<=20);
//     }
    
// }


// print even number from 1 to 20 using do while loop

class do_while{
    public static void main(String[] args) {
        int x = 1;
        do {
            if(x%2 == 0){
            System.out.println(x);
            }
            x++;
        }
        while(x<=20);
    }
}
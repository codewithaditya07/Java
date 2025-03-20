
//switch case 
import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        switch (x) {
            case 1: {
                System.out.println("Enter rupee");
                int a = sc.nextInt();
                System.out.println("Total Dollar is  %2 ");
                System.out.println(a/86.43);
                
            }
            case 2: {
                System.out.println("Enter dollar");
                int b = sc.nextInt();
                System.out.println("Total rupee is %2 ");
                System.out.println(b*86.43);

            }
        }
        sc.close();
    }
}

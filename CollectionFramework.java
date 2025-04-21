import java.util.ArrayList;
import java.util.Scanner;
public class CollectionFramework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Array List

        ArrayList adi=new ArrayList();
        adi.add(10);
        System.out.println(adi);
        adi.add(15);
        System.out.println(adi);
        adi.remove(1);
        System.out.println(adi);

        System.out.println("Enter size of Array :- ");
        int k = sc.nextInt();
        
        for (int x = 1; x<=k;x++){
            System.out.println("Enter Element in Array :- ");
            adi.add(sc.nextInt());

            System.out.println(adi);
        }
    }
    
}

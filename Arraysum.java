import java.util.Scanner;

public class Arraysum {

    public static void main(String[] args) {
        int a[] = new int[10], x;

        Scanner sc = new Scanner(System.in);

        for (x = 0; x < 10; x++) {
            System.out.println("Enter array");
            a[x] = sc.nextInt();
        }

        System.out.println(" your array ");
        for (x = 0; x < 10; x++) {
            System.out.print(a[x] + ",");
        }

        System.out.println("\nEven Number:- ");
        for (x = 0; x < 10; x++) {
            if (a[x] % 2 == 0)
                System.out.print(a[x] + ",");
        }

        System.out.println("\nOdd Number:- ");
        for (x = 0; x < 10; x++) {
            if (a[x] % 2 == 1)
                System.out.print(a[x] + ",");
        }

        
        int d=0;
        int D=0;

        for(x=0;x<10;x++)
        {
            if(a[x]%2==0)
            d=d+a[x];
            else
            D=D+a[x];

        }
        System.out.println("\nsum of even number :-" +d);
        System.out.println("sum of odd number :-" +D);
sc.close();
    }
}

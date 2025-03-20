import java.util.Scanner;

public class Array {
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
    sc.close();
    }
}

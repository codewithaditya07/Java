
//Create 3x3 Matrix
//Transpose of Array
//Count Total Even Number and Odd 
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create 3x3 matrix
        int a[][] = new int[3][3];
        int x, y;
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.println("Enter Any Array Elements :-");
                a[x][y] = sc.nextInt();
            }
        }
        // matrix
        System.out.println("your matrix");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(a[x][y] + " ");
            }
            System.out.println(" ");
        }
        // Transpose of Array
        System.out.println("Transpose of Array");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(a[y][x] + " ");
            }
            System.out.println(" ");
        }

        // Count Total Even Number and Odd
        System.out.println("Number of Even or odd");
        int Even = 0, Odd = 0, SE = 0, SO = 0; // SE=SUM OF EVEN ,,SO =SUM OF ODD

        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                if (a[x][y] % 2 == 0) {
                    Even = Even + 1;
                    SE = SE + a[x][y];
                } else {
                    Odd = Odd + 1;
                    SO = SO + a[x][y];
                }
            }
        }

        System.out.println("Total Even Values=  " + Even + " And Sum is " + SE);
        System.out.println("Total ODD Values=  " + Odd + " And Sum is " + SO);

    }

}

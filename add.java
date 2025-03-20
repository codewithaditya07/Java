import java.util.Scanner;

class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("enter first number");
        x = sc.nextInt();

        System.out.println("enter second number");
        y = sc.nextInt();

        z = x + y;
        System.out.println("the sum");
        System.out.println(z);
        sc.close();
    }
}
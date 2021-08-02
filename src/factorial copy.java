// Factorial of a number

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, i, f = 1;
        System.out.println("Enter any number: ");
        a = scan.nextInt();
        for (i = 1; i <= a; i++) {
            f = f * i;
            scan.close();
        }
        System.out.print(f);
    }
}

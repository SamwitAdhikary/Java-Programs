// Neon Number

import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, a, r, s = 0;
        System.out.println("Enter any number: ");
        x = scan.nextInt();
        a = x * x;
        while (a != 0) {
            r = a % 10;
            a = a / 10;
            s = s + r;
        }
        if (x == s) {
            System.out.println("The number is neon.");
        } else {
            System.out.println("The number is not neon.");
        }
        scan.close();
    }
}

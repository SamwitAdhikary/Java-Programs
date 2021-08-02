// Factors of a number

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, i;
        System.out.println("Enter any number: ");
        x = scan.nextInt();
        for (i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + ", ");
            }
            scan.close();
        }
    }
}

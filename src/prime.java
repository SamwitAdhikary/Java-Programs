// Prime Number

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, c = 0;
        System.out.println("Enter any number: ");
        num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                c += 1;
            }
        }
        if(c == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        scan.close();
    }
}

// Sum of a digit

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, s=0, r;
        System.out.println("Enter Any Number: ");
        n = scan.nextInt();
        while(n > 0)
        {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println(s);
        scan.close();
    }
}

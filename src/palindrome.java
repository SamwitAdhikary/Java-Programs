// Palindrome Number

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, r, s = 0, p;
        System.out.println("Enter any number: ");        
        x = scan.nextInt();
        p = x;
        while(x > 0) {
            r = x % 10;
            x = x / 10;
            s = s * 10 + r;
        }
        if(p == s) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        scan.close();
    }
}

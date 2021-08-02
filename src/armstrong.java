// Armstrong Number

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, s = 0, r, a;
        System.out.println("Enter any number: ");
        x = scan.nextInt();
        a = x;
        while(x != 0) {
            r = x % 10;
            x = x / 10;
            s = s + (r * r * r);
        }    
        if(s == a) {
            System.out.println(a + " is an Armstrong Number.");
        } else {
            System.out.println(a + " is not an Armstrong Number.");
        }
        scan.close();
    }
}
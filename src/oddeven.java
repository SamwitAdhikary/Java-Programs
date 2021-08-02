// Odd Even

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.println("Enter a number: ");       
        num1 = scan.nextInt();
        if(num1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        scan.close();
    }
}
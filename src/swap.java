// Swapping of 2 numbers

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter 2 Numbers: ");        
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping: " + num1 + ", " + num2);
        scan.close();
    }
}

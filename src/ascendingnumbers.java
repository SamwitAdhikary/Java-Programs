// Take 3 integers and print them in ascending orders:-

import java.util.Scanner;

public class ascendingnumbers
{
    public static void main(String[] args) {
        // Declarations
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Value: ");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd Value: ");
        int num2 = scan.nextInt();

        System.out.println("Enter 3rd Value: ");
        int num3 = scan.nextInt();

        if ((num1 < num2) && (num2 < num3)) {
            System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
        }
        if ((num1 < num2) && (num2 > num3)) {
            System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2);
        }
        if ((num1 > num2) && (num2 > num3)) {
            System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1);
        }
        if ((num1 > num2) && (num2 < num3)) {
            System.out.println("The sorted numbers are " + num2 + " " + num1 + " " + num3);
        }
        scan.close();
    }
}
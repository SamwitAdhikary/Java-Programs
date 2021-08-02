//Armstrong Number between 2 numbers

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        num1 = scan.nextInt();
        System.out.println("Enter 2nd Number: ");
        num2 = scan.nextInt();

        for(int i = num1; i < num2; i++)
        {
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i) {
                System.out.println("" + i + " is Armstrong number");
            }
        }
        scan.close();
    }
}

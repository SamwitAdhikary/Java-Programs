// Prime number between a range

import java.util.Scanner;

public class primebetweennum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, c = 0;
        System.out.print("Enter the Starting Point: ");
        num1 = scan.nextInt();
        System.out.print("Enter the Ending Point: ");
        num2 = scan.nextInt();
        for(int i = num1; i <= num2; i++) {
            c = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    c += 1;
                }
            }
            if(c == 2) {
                System.out.print(i + ", ");
            }
        }
        scan.close();
    }    
}

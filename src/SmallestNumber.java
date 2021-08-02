import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3)
            System.out.println("The smallest number is: " + num1);
        else if (num2 < num1 && num2 < num3)
            System.out.println("The smallest number is: " + num2);
        else if (num3 < num1 && num3 < num2)
            System.out.println("The smallest number is: " + num3);
        else
            System.out.println("The numbers are same.");

        scanner.close();
    }
}
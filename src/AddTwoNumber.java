//! Program to add 2 numbers

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        int num1, num2;
        String choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 Numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Enter Your Choice of Operation (+, -, *, /): ");
        choice = scanner.next();

        switch(choice) {
            case "+":
                System.out.println("Addition: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case "*": 
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case "/":
                System.out.println("Division: " + (num1 / num2));
                break;

            default:
                System.out.println("Sorry!! No Operation Found!!");
        }

        scanner.close();

    }
}

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 Numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.println("Max is: " + ((num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3)));

        scanner.close(); 
    }
}
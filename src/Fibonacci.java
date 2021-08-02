import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, firstTerm = 0, secondTerm = 1;
        System.out.println("Enter Number: ");
        num = scanner.nextInt();

        System.out.println("Fibbonacci Series till " + num + " terms: ");

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        scanner.close();
    }
}
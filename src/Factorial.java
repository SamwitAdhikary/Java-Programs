import java.util.Scanner;

public class Factorial {
    int num, fact = 1;
    
    void input(int num1) {
        num = num1;
    }

    int logic() {
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Number: ");
        int num = scanner.nextInt();

        factorial.input(num);
        System.out.println("Factorial: " + factorial.logic());

        scanner.close();
    }
}

import java.util.Scanner;

public class Summation {
    double sum = 0.0;
    
    double sum(int num) {
        for(double i = 1; i <= num; i++) {
            sum += 1/i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Summation summation = new Summation();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        System.out.print("Sum is: " + summation.sum(num));

        scanner.close();
    }
}

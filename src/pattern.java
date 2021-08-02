import java.util.Scanner;

public class pattern {
    int num;

    void input(int num1) {
        num = num1;
    }

    void logic() {
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        pattern pattern = new pattern();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num1 = scanner.nextInt();
        pattern.input(num1);
        pattern.logic();

        scanner.close();
    }
}

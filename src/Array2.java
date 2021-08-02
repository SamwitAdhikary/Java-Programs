import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int num, count1 = 0, count2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number You Want to Enter: ");
        num = scanner.nextInt();

        int[] arr = new int[num];
        int[] arrEven = new int[num];
        int[] arrOdd = new int[num];

        System.out.println("Enter " + num + " Values:");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 != 0) {
                arrOdd[count1] = arr[i];
                count1++;
            } else {
                arrEven[count2] = arr[i];
                count2++;
            }
        }
        System.out.println("\n\nOutput: ");
        for (int i = 0; i < count1; i++) {
            System.out.println(arrOdd[i]);
        }
        for (int i = 0; i < count2; i++) {
            System.out.println(arrEven[i]);
        }
        scanner.close();
    }
}

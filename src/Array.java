import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int num, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number you want to enter: ");
        num = scanner.nextInt();

        int[] arr;
        int[] arr2;
        arr = new int[num];
        arr2 = new int[num];

        System.out.println("Enter " + num + " values: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if(arr[i] % 2 == 0) {
                arr2[count] = arr[i];
                count++;
            }
        }
        System.out.println("\n\nEven Numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr2[i]);
        }
        scanner.close();
    }
}

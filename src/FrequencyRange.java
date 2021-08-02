import java.util.Scanner;

public class FrequencyRange {
    public static void main(String[] args) {
        int s, l, n;
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Digits: ");
        n = scanner.nextInt();
        System.out.println("Enter " + n + " Values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        s = ((min / 10) * 10) - 10;
        l = ((max / 10) * 10);
        for (int i = s; i <= l; i += 10) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i && arr[j] <= (i + 10)) {
                    count++;
                }
            }
            System.out.println("\n" + i + " \t-\t " + (i + 9) + " \t:\t " + count);
        }
    }
}

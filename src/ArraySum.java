import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        int evensum = 0, oddsum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Numbers: ");
        for(int num = 0; num < 10; num++) {
            arr[num] = scan.nextInt();
        }

        // Logic Part
        for(int num = 0; num < 10; num++) {
            if(arr[num] % 2 == 0) {
                evensum += arr[num];
            }
            else {
                oddsum += arr[num];
            }
        }

        System.out.println("Sum of Even Numbers: " + evensum + ", Sum of odd Numbers: " + oddsum);
        scan.close();
    }    
}

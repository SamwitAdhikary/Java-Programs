import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr;
        int search, flag = 0;
        arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");

        for(int num = 0; num < 10; num++) {
            arr[num] = scanner.nextInt();
        }

        System.out.println("Enter Number to Search: ");
        search = scanner.nextInt();
        for(int num = 0; num < 10; num++){
            if(arr[num] == search) {
                flag = 1;
                break;
            }
        }

        if(flag == 1) {
            System.out.println(search + " found!!");
        }
        else{
            System.out.println(search + " not found!!");
        }
        scanner.close();
    }
}

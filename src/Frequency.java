import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No. Of Digits: ");
        int nums = scanner.nextInt();
        
        int[] arr = new int[nums];

        System.out.println("Enter " + nums + " numbers: ");
        for(int i = 0; i < nums; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] fr = new int[arr.length];
        
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
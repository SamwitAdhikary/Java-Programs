// Bresenham Algorithm

import java.util.Scanner;

public class Bresenham {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of H: ");
        int h = scan.nextInt();

        System.out.println("Enter the value of R: ");
        int r = scan.nextInt();

        int x = 0;

        if(h == 0) {
            x = h;
        }
        int y = r;
        int d = 3 - 2 * r;

        while(x <= y) {
            if(d < 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y -= 1;
            }
            x += 1;
            System.out.println("X: " + x + " Y: " + y);
        }

        scan.close();
    }
}

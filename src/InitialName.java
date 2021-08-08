import java.util.Scanner;

class InitialName {
    public static void main(String[] args) {
        String n;
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        n = scanner.nextLine();

        String[] t = n.split(" ");

        int l = t.length;

        System.out.print("Your Short Name: ");
        for(int i = 0; i < l - 1; i++) {
            System.out.print(t[i].charAt(0) + ". ");
        }

        System.out.print(t[l - 1]);

        scanner.close();
    }
}
import java.util.Scanner;

class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            // Create a random number for the user to guess
            int theNumber = (int)(Math.random() * 10 + 1);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 10: ");
                guess = scan.nextInt();
                if (guess < theNumber) 
                    System.out.println(guess + " is too low. Try Again!!");
                else if (guess > theNumber) 
                    System.out.println(guess + " is too high. Try Again!!");
                else
                    System.out.println(guess + " is correct. You Win!!");
            }
            System.out.println("Would you like to play again (y/n): ");
            playAgain = scan.next();
        } while(playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank You for playing! Goodbye.");
        scan.close();
    }
}
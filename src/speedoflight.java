// Speed of light

import java.util.Scanner;

class speedoflight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lightspeed;
        long days;
        long seconds;
        long distance;

        // Approximate speed of light in miles per second
        lightspeed = 186000;

        System.out.print("Enter Number of Days: ");
        days = scan.nextInt();

        seconds = days * 24 * 60 * 60; // Convert to seconds

        distance = lightspeed * seconds; // Compute distance

        System.out.print("In " + days + " days, light will travel about " + distance + " miles.");
        scan.close();
    }
}
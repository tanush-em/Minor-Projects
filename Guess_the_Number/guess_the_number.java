import java.util.Scanner;

public class guess_the_number {
    public static void main(String args[]) {

        int randnum = (int) (Math.random() * 101);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your guess (or a negative number to quit): ");
            int guesnum = scan.nextInt();

            if (guesnum < 0) {
                System.out.println("You quit the game.");
                break;
            }

            if (guesnum == randnum) {
                System.out.println("Your guess " + guesnum + " is correct !!!");
                break; 
            } else if (guesnum > randnum) {
                System.out.println("Your guess " + guesnum + " is higher than the number");
            } else {
                System.out.println("Your guess " + guesnum + " is lower than the number");
            }
        }
    }
}

/**
 * Created by todd on 11/02/2017.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int guess = 0;
        int number = rand.nextInt(100) + 1;

        // Let user guess the number until they get it correct
        while (number != guess) {
            System.out.println("I am thinking of a number between 1 and 100. Can you guess the number?");
            guess = input.nextInt();

            if (guess > number) {
                System.out.println("Too high");
            }
            else if (guess < number) {
                System.out.println("Too low");
            }
            else {
                System.out.print("Correct!");
                System.out.print("Press 1 to play again: ");

            }

        }

    }
}

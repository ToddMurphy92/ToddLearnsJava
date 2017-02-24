/**
 * Created by todd on 11/02/2017.
 */
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // int number = 90;
        int guess = 1;
        int number = rand.nextInt(100) + 1;

        System.out.println("I am thinking of a number between 1 and 100. Can you guess the number?");

        // Get value
        guess = input.nextInt();

        // Compare number to guess
        if (number == guess) {
            System.out.println("Correct - the number is " + number);
        }
        else if (guess > number){
            System.out.println("Guess is too high - the number was " + number);
        }
        else {
            System.out.println("Guess is too low - the number was " + number);
        }

    }
}

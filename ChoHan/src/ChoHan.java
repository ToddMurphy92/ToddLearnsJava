import java.util.Scanner;

/**
 * Created by todd on 15/3/17.
 */

import java.util.Scanner;

public class ChoHan {

    private int winnings;
    private int plays;
    Dice [] dice;
    String diceDecision = new String();


    // Constructor
    // Sets winning and losses to 0
    public ChoHan () {

        winnings = 0;
        plays = 0;

    }

    public void play () { // THIS MUST USE THE DICE CLASS

        Scanner input = new Scanner (System.in);
        this.dice = new Dice[2];
        String replayDecision = new String("y");

        while (replayDecision.toLowerCase().contains("y") == true) {

            ++plays;

            // Get odd / even decision
            System.out.println("Would you like to use odd or even? Enter 'Odd' or 'Even': ");
            diceDecision = input.nextLine();

            // Roll dice
            // dice[].roll();                  // Test line
            System.out.println(dice[0]);    // Test line
            //dice[0].roll();                 // Know this will work
            //dice[1].roll();                 // Know this will work
            //System.out.println(dice[0].toInt());    // Compare with test line


            // Adjust winnings value
            if (this.won() == true) {
                ++this.winnings;
            }

            // Ask if to play again
            System.out.println("Would you like to play again? Yes / No");
            replayDecision = input.nextLine();


        }
        // Display total win/losses if no
        this.reportWinnings();

    } // end method play

    private boolean won() { // ONLY USED IN THIS CLASS

        int total = 0;
        boolean isEven = diceDecision.toLowerCase().startsWith("e");

        // TO-DO: Fix this for loop below

        for (int i = 0; i < dice.length; i++) {
            int x = dice[i].toInt();
            total = total + x;
        }

        // Determine if player has won
        if (total % 2 == 0 && isEven == true) {
            return true;
        }
        else if (total % 2 == 1 && isEven == false) {
            return true;
        }
        else {
            return false;
        }


    }

    private void reportWinnings() {

        //

    }


}
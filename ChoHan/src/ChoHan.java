import java.util.Scanner;

/**
 * Created by todd on 15/3/17.
 */

import java.util.Scanner;

public class ChoHan {

    private int winnings;
    private int plays;
    Dice[] dice = new Dice[2];
    String diceDecision = new String();


    // Constructor
    // Sets winning and losses to 0
    public ChoHan () {

        winnings = 0;
        plays = 0;

    }

    public void play () { // THIS MUST USE THE DICE CLASS

        Scanner input = new Scanner (System.in);
        this.dice[0] = new Dice();
        this.dice[1] = new Dice();
        String replayDecision = new String("y");

        while (replayDecision.toLowerCase().contains("y") == true) {

            ++plays;
            this.dice[0].roll();
            this.dice[1].roll();

            // Get odd / even decision
            System.out.println("Would you like to use odd or even? Enter 'Odd' or 'Even': ");
            diceDecision = input.nextLine();

            // Roll dice
            // dice[].roll();                  // Test line
            // System.out.println(dice[0]);    // Test line
            //dice[0].roll();                 // Know this will work
            //dice[1].roll();                 // Know this will work
            //System.out.println(dice[0].toInt());    // Compare with test line


            // Check if player won and adjust winnings value
            if (this.won() == true) {
                ++this.winnings;
                System.out.println("Congrats, you win!");
            }
            else {
                System.out.println("Sorry mate, you lose :(");
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

        System.out.println("Dice 1 value is :" + this.dice[0].toInt());
        System.out.println("Dice 2 value is :" + this.dice[1].toInt());
        System.out.println("Total of both dice is: " + total);

        for (int i = 0; i < this.dice.length; i++) {
            int x = this.dice[i].toInt();
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
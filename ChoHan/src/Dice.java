/**
 * Created by todd on 15/3/17.
 */

import java.util.Random;

public class Dice {

    public int diceNum;
    Random randomNumber = new Random (System.currentTimeMillis());

    public Dice () {

        // TO-DO: Consider creating the dice with a random number rather than 0
        this.diceNum = randomNumber.nextInt(6);
        // this.diceNum = 0;

    }

    public void roll() { // Roll dice

        // TO-DO: Fix later - Set as random number instead of 2
        this.diceNum = randomNumber.nextInt(6);
        //this.diceNum = 2;   // Not setting as random number rn for troubleshooting purposes

    }

    public int toInt() {
        return this.diceNum;
    }

}

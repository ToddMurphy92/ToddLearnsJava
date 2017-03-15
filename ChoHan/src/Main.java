/**
 * Created by todd on 15/3/17.
 */
public class Main {

    public static void main (String [] args) {

        // ARGUMENTS
        ChoHan game = new ChoHan();     // New game argument

        // Call a class that asks the player if they would like to play
        // This will loop until player decides not to play anymore
        game.play();

    }

}

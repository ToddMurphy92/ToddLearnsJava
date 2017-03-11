/**
 * Created by todd on 4/3/17.
 */
public class Card {

    // attributes
    private String suit;
    private int face;

    // constructor
    public Card (String suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    // method
    public String toString () {
        // return "Suit: " + suit + "\n" + "Face: " + face;
        return face + " of " + suit;
    }

    // method
    public Integer faceValue () {
        return face;
    }

}

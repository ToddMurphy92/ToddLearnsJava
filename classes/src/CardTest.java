/**
 * Created by todd on 4/3/17.
 */
public class CardTest {

    public static void main (String [] args) {

        /* Card c1 = new Card ("Spades", "Ace");
        Card c2 = new Card ("Joker", "N/A");
        Card c3 = new Card ("Diamonds", "Two");
        Card c4 = new Card ("Rubys", "Thirteen");

        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4); */

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            System.out.println(deck.deal());
        }




    }

}

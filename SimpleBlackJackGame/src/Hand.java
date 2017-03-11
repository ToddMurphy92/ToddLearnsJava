/**
 * Created by todd on 10/3/17.
 */ /*
public class Hand {

    final int SIZE_OF_HAND = 2;     // Sets hand size
    Card [] handCards;              // Creates array of Card - handCards
    int handCardNum = 0;
    private String deckName;        // String containing the name of the deck e.g. deckName = "deck";
                                    // Knowing the deck tells us which deck this hand draws from
    int handScore = 0;              // Value of the hand
    int NUM_OF_CARDS = 52;          // Terrible way to do this... should fix later


    public Hand (String deckName) {

        handCards = new Card[SIZE_OF_HAND];     // Creates handCards object

        this.deckName = deckName;

    } // end constructor


    public Integer handValue () {

        handScore = 0;      // Resets value to 0 before adding up all cards in the hand

        for (int i = 0; i < handCards.length; i++) {

            handScore = handScore + handCards[i].faceValue();

        }

        return handScore;   // Returns the value of the hand

    }   // end method - handValue


    public void dealHand () {

        // if ( NUM_OF_CARDS = 52) { // to-do: Fix this
            for (int i = 0; i < handCards.length; i++) {

                Card c = new Card (deal());     // to-do: Deal card and make that value c
                handCards[i] = c;

            }
       // } //end if
       // else {
        //    System.out.println("Deck is empty - please shuffle");
        // } // end else


    }

}
*/
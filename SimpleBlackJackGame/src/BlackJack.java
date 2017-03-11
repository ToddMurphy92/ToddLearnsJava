/**
 * Created by todd on 11/3/17.
 */
public class BlackJack {

    public static void main (String [] args) {

        // ATTRIBUTES
        DeckOfCards deck = new DeckOfCards();   // Deck
        Card[] playerHand = new Card[8];                      // Player hand - Array of cards
        Card[] dealerHand = new Card[8];                      // Dealer hand - Array of cards
        int playerCardCount = 0;
        int dealerCardCount = 0;

        // DEAL CARDS
        for (int i = 0; i < 2; i++) {

            playerHand[i] = deck.deal();
            ++playerCardCount;

            dealerHand[i] = deck.deal();
            ++dealerCardCount;

        }

        // DISPLAY CARDS TO PLAYER
        System.out.println("Player hand: " + playerHand[0].toString() + " and " + playerHand[1].toString());
        System.out.println("Dealer hand: " + dealerHand[0].toString() + " unknown");

        // OUTPUT VALUE OF PLAYER HAND
        System.out.println("Player hand value: " + handValue(playerHand));           // To-do: Print hand value

    }

    // GET THE VALUE OF THE PLAYERS HAND
    public Integer handValue (Card [] handName) {

        int count = 0;

        for (int i = 0; i < handName.length(); i++) {

            if (handName[i].faceValue() < 10) {
                count += handName[i].faceValue();
            }
            else if (handName[i].faceValue() >= 10) {
                count += 10;
            }

        }

        int x = 0;
        while (count < 12 && x < 8) {

            if (handName[x].faceValue() == 1) {
                count += 10;
            }

            x++;
        }

        return count;

    }


}

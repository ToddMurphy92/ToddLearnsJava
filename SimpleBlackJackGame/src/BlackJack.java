/**
 * Created by todd on 11/3/17.
 */
public class BlackJack {

    public static void main (String [] args) {

        BlackJack black = new BlackJack();

        // ATTRIBUTES
        DeckOfCards deck = new DeckOfCards();   // Deck
        Card[] playerHand = new Card[8];                      // Player hand - Array of cards
        Card[] dealerHand = new Card[8];                      // Dealer hand - Array of cards
        int playerCardCount = 0;
        int dealerCardCount = 0;

        // SHUFFLE DECK
        deck.shuffle();

        // DEAL CARDS
        for (int i = 0; i < 2; i++) {

            playerHand[i] = deck.deal();
            ++playerCardCount;

            dealerHand[i] = deck.deal();
            ++dealerCardCount;

        }

        // DISPLAY CARDS TO PLAYER
        System.out.println("Player hand: " + playerHand[0].toString() + " and " + playerHand[1].toString());
        System.out.println("Dealer hand: " + dealerHand[0].toString() + " and an unknown card");

        // OUTPUT VALUE OF PLAYER HAND AND DEALER HAND
        System.out.println("Player hand value: " + black.handValue(playerHand, playerCardCount));
        System.out.println("Dealer hand value: " + black.handValue(dealerHand, dealerCardCount));



    }

    // GET THE VALUE OF THE PLAYERS HAND
    public int handValue (Card[] handName, int length) {

        int count = 0;
        int aces = 0;

        for (int i = 0; i < length; i++) {

            if (handName[i].faceValue() < 10 && handName[i].faceValue() > 1) {
                count += handName[i].faceValue();
            }
            else if (handName[i].faceValue() >= 10) {
                count += 10;
            }
            else if (handName[i].faceValue() == 1){
                count += 11;
            }

        }

        if (aces > 1) {
            count = count - ((aces - 1) * 10);
        }

        return count;

    }


}

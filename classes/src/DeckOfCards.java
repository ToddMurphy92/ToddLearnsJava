/**
 * Created by todd on 4/3/17.
 */

import java.util.Random;

public class DeckOfCards {

        Card [] cards;
        final int NUM_OF_CARDS = 52;
        int cardNum = 0; // Position in the deck. When >= cards.length (aka NUM_OF_CARDS) deck is empty.
        Random randomNumber = new Random (System.currentTimeMillis()); // Used by shuffle()

        public DeckOfCards () { // Creates the deck of cards

            cards = new Card[NUM_OF_CARDS];

            String [] suits = {
                    "Clubs", "Spades", "Hearts", "Diamonds"
            }; // end array suits

            String [] faces = {
                    "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
            }; // end array faces


            int positionInDeck = 0;

            for (int suitCount = 0; suitCount < suits.length; suitCount++) {

                for (int faceCount = 0; faceCount < faces.length; faceCount++) {

                    Card c = new Card (suits[suitCount], faces[faceCount]);
                    // System.out.println(c);

                    cards[positionInDeck++] = c;

                } // end loop faceCount

            } // end loop suitCount

        } // end DeckOfCards


        public Card deal() { // Deals the top card
            if (cardNum < cards.length) {               // Checks the deck is not empty
                return this.cards[cardNum++];           // Deals the card at the top of the deck
            }
            else {
                return null; // shuffle() will reset cardNum to 0
            }


        } // end deal()

        public void shuffle() { // Shuffles the deck and resets cardNum (deck position) to 0



            for (int i = 0; i < cards.length; i++) {

                cardNum = 0; // Reset deck position to 0

                // Set first random value x
                // int x = (int)(Math.random() * 52) - 1;
                int x = randomNumber.nextInt(52);

                // Create placeholder temp card
                Card tempCard = cards[i];

                // Swap card i with card x
                cards[i] = cards[x];

                cards[x] = tempCard;

            }


        } // end shuffle()




} // end class DeckofCards

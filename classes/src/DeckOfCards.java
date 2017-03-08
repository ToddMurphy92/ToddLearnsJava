/**
 * Created by todd on 4/3/17.
 */

import java.util.Random;

public class DeckOfCards {

        Card [] cards;
        final int NUM_OF_CARDS = 52;
        int cardNum = 0;

        public DeckOfCards () {

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

        } // end method DeckOfCards


        public Card deal() {
            return this.cards[cardNum++];
        }

        public void shuffle() {

            Random randomNumber = new Random (System.currentTimeMillis());

            for (int i = 0; i < cards.length; i++) {

                // Set first random value x
                // int x = (int)(Math.random() * 52) - 1;
                int x = randomNumber.nextInt(52);

                // Create placeholder temp card
                Card tempCard = cards[i];

                // Swap card i with card x
                cards[i] = cards[x];

                cards[x] = tempCard;

            }


        }




} // end class DeckofCards

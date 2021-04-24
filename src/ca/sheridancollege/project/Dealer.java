package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ruvon
 */
public class Dealer extends GroupOfCards {

    //The dealers hand
    private ArrayList<Card> hand = new ArrayList<>();

    //The deck of cards the dealer will draw from
    private ArrayList<Card> deck = new ArrayList<>();

    /* The value to be beaten by the player, will be hidden until the 
     * player is satisfied with their hand value
     */
    private int handValue;

    //CONSTRUCTOR WILL CREATE ALL 52 CARDS IN THE DECK
    public Dealer() {

        //The following will make 13 cards of the Diamond suite for the dealer
        for (int i = 1; i <= 10; i++) {
            this.deck.add(new Diamond(i, ("" + i)));
        }
        this.deck.add(new Diamond(10, "Jack"));
        this.deck.add(new Diamond(10, "Queen"));
        this.deck.add(new Diamond(10, "King"));
        //end of diamonds index is at 12 (13 cards)

        //The following will make 13 cards of the Hearts suite for the dealer
        for (int i = 1; i <= 10; i++) {
            this.deck.add(new Heart(i, ("" + i)));
        }
        this.deck.add(new Heart(10, "Jack"));
        this.deck.add(new Heart(10, "Queen"));
        this.deck.add(new Heart(10, "King"));
        //end of hearts index is at 25 (26 cards made)

        //The following will make 13 cards of the Spades suite for the dealer
        for (int i = 1; i <= 10; i++) {
            this.deck.add(new Spade(i, ("" + i)));
        }
        this.deck.add(new Spade(10, "Jack"));
        this.deck.add(new Spade(10, "Queen"));
        this.deck.add(new Spade(10, "King"));
        //end of hearts index is at 38 (39 cards made)

        //The following will make 13 cards of the Club suite for the dealer
        for (int i = 1; i <= 10; i++) {
            this.deck.add(new Club(i, ("" + i)));
        }
        this.deck.add(new Club(10, "Jack"));
        this.deck.add(new Club(10, "Queen"));
        this.deck.add(new Club(10, "King"));
        //end of hearts index is at 51 (52 cards made)

    }//end of constructor

    //This method will shuffle this deck
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    //This method will draw the dealers 2 cards from a shuffled deck
    public void drawTwo() {
        while (this.hand.size() != 2) {
            shuffle();

            this.hand.add(this.deck.get(0));
            this.hand.add(this.deck.get(1));

        }
    }

    /* This method will iterate through each card and find the total 
     * value of the dealer's hand
     */
    public int getHandValue() {

        for (Card a : this.hand) {
            this.handValue += a.getValue();
        }
        return this.handValue;
    }

    //This method will give the player their first 2 cards from a shuffled deck
    public void dealTwo(ArrayList<Card> hand) {

        while (hand.size() != 2) {
            shuffle();

            hand.add(this.deck.get(0));
            hand.add(this.deck.get(1));
        }

    }

    //This method will deal a player ONE card (hit) from a shuffled deck     
    public void dealOne(ArrayList<Card> hand) {

        shuffle();

        hand.add(this.deck.get(0));

    }

}

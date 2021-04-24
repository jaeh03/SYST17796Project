/*
 * Ruvon
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class Player {

    //THE CARDS PLAYER HAS IN PLAY
    public ArrayList<Card> hand = new ArrayList<>();

    //THE TOTAL CARD VALUE OF THEIR HAND 
    private int handValue;

    //the unique name for this player
    private String name;

    //SETTER FOR NAME
    public Player(String name) {
        this.setName(name);
    }

    //CONSTRUCTOR
    public Player() {
    }

    //GETTER
    public String getName() {
        return name;
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }

    //WILL RETURN THE NAME AND SUITE OF EACH CARD IN HAND
    public ArrayList<Card> getCards() {
        return this.hand;

    }

    /* This method will iterate through each card and find the total 
     * value of the PLAYER's hand
     */
    public int getHandValue() {
        this.handValue = 0;
        for (Card a : hand) {
            this.handValue += a.getValue();
        }
        return this.handValue;
    }

}

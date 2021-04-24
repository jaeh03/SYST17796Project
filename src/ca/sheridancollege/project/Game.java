/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

public abstract class Game {

    //NAME OF OUR GAME
    private final String name="Diamond Hands";//the title of the game
    

    public Game() { }

   
    public String getName() {
        return name;
    }


    //Method to Start the Game
    public abstract void play(Dealer d,Player p);

   //Method to find the Winner.
    public abstract void declareWinner(Dealer d,Player p);

}//end class

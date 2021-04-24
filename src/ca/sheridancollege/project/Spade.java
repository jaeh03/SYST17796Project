
package ca.sheridancollege.project;

/**
 * THE SPADE SUITE   
 * @author Ruvon
 */
public class Spade extends Card {
    
    
public Spade(int value, String Name) {
        super(value, Name);
    }
    
    
      @Override
    public String toString() {
        return ""+this.Name+" of Spades"; 
    }
    
}

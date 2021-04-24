
package ca.sheridancollege.project;

/**
 * THE CLUB SUITE 
 * @author Ruvon
 */
public class Club extends Card {
  
    
    public Club(int value, String Name) {
        super(value, Name);
    }
    
    
      @Override
    public String toString() {
        return ""+this.Name+" of Clubs"; 
    }
    
}

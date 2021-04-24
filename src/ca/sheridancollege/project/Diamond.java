
package ca.sheridancollege.project;

/**
 * //THE DIAMOND SUITE   
 * @author Ruvon
 */
public class Diamond extends Card {

    public Diamond(int value, String Name) {
        super(value, Name);
    }

    
    
    
    @Override
    public String toString() {
        return ""+this.Name+" of Diamonds"; 
    }
    
}

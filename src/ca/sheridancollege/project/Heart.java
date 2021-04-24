
package ca.sheridancollege.project;

/**
 * //THE HEART SUITE   
 * @author Ruvon
 */
public class Heart extends Card{

    public Heart(int value, String Name) {
        super(value, Name);
    }
    
    
      @Override
    public String toString() {
        return ""+this.Name+" of Hearts"; 
    }
    
}

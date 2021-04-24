
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private  ArrayList<Card> cards=new ArrayList<>();
    
    private  int size;//the size of the grouping;

    public GroupOfCards() {
       
       this.size=this.cards.size();
       
    }//end of constructor

 
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return this.size;
    }


}//end class

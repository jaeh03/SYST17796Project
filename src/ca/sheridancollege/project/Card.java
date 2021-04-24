
package ca.sheridancollege.project;

public abstract class Card {
    //default modifier for child classes

    int value;
    String Name;

    public Card(int value, String Name) {
        this.value = value;
        this.Name = Name;
    }

    public Card() {
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public abstract String toString();

}

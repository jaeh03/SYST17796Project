package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Ruvon
 */
public class DiamondHands extends Game {

    static Scanner in = new Scanner(System.in);

    public DiamondHands() {
    }

    //This method will start the game!
    @Override
    public void play(Dealer d, Player a) {
        System.out.println("Hello and Welcome to " + super.getName());
        System.out.println("What is your name? Enter Player Name: ");
        String pName = in.nextLine();
        System.out.println("Nice to meet you " + pName + " !");
        a.setName(pName);
        System.out.println("I will be your dealer for this game, let us begin.\n"
                + "\nI will draw two cards as well as deal you two cards to start");
        d.drawTwo();
        d.dealTwo(a.hand);
        System.out.println("Your current hand is : " + a.hand);
        System.out.println("Your current hand value is : " + a.getHandValue());

        System.out.println("\nWould you like another Card? \n");
        System.out.println("Enter 'Y' for yes OR 'N' for no");
        String hitChoice = in.nextLine();

        while (hitChoice.equalsIgnoreCase("y")) {
            d.dealOne(a.hand);
            System.out.println("Your current hand is : " + a.hand);
            System.out.println("Your current hand value is : " + a.getHandValue());

            if (a.getHandValue() > 21) {
                System.out.println("Sorry you've gone bust and lost");
                hitChoice = "n";

            } else {
                System.out.println("\nWould you like another Card? \n");
                System.out.println("Enter 'Y' for yes OR 'N' for no");
                hitChoice = in.nextLine();
            }
        }
        System.out.println("\nLets find the Winner then!");

        declareWinner(d, a);

    }

    //Method will tell player if they have beaten,tied or lost to the dealer.
    @Override
    public void declareWinner(Dealer d, Player p) {
        int dealerVal = d.getHandValue();
        int playerVal = p.getHandValue();
        System.out.println("\nThe dealer's hand value is: " + dealerVal);
        System.out.println("Your hand value is: " + playerVal);
        if (!(playerVal > 21)) {
            if (dealerVal < playerVal) {

                System.out.println("\nCONGRATULATIONS!! YOU WIN!");
            } else if (dealerVal == playerVal) {
                System.out.println("\nWOW YOU TIED WITH THE DEALER!!");
            }
        } else {
            System.out.println("\nSORRY!! YOU LOSE!");
        }

    }

    public static void main(String[] args) {
        Player one = new Player();
        Dealer d = new Dealer();

        DiamondHands game = new DiamondHands();
        String start;
        System.out.println("---------ENTER START TO PLAY---------");
        start = in.nextLine();
        if (start.equalsIgnoreCase("start")) {
            game.play(d, one);
        } else {
            System.out.println("---Maybe Another Time---");
        }

    }
}

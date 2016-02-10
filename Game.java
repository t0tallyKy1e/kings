/*
    Kings Card Game
    Created by t0tallyKy1e
    1/28/2016
    Kings Game Class
*/

package kings;

import java.util.*;

//default Constructor
public class Game{
    private Scanner input = new Scanner(System.in);
    private String userString = " ";
    
    //properties
    private Deck deck = new Deck();
    private int index = 0;
    
    public Game(){
        deck.shuffleDeck();
        menu();
    }//close default Constructor
    
    public void showRule(){
        Card tempCard = new Card();
        int cardValue = 0;
        
        tempCard = deck.getShuffledCard(index);
        cardValue = tempCard.getIntCardValue();
        
        switch(cardValue){
            case 0://two
                System.out.println("------------------------------------------------------------\nFUCK YOU!\n------------------------------------------------------------");
                System.out.println("Make someone else drink.");
                break;
            case 1://three
                System.out.println("------------------------------------------------------------\nME!\n------------------------------------------------------------");
                System.out.println("You must drink.");
                break;
            case 2://four
                System.out.println("------------------------------------------------------------\nFLOOR!\n------------------------------------------------------------");
                System.out.println("Everyone must touch the floor.");
                System.out.println("The last person to do so has to drink.");
                break;
            case 3://five
                System.out.println("------------------------------------------------------------\nGUYS!\n------------------------------------------------------------");
                System.out.println("Guys drink.");
                break;
            case 4://six
                System.out.println("------------------------------------------------------------\nCHICKS!\n------------------------------------------------------------");
                System.out.println("Girls drink.");
                break;
            case 5://seven
                System.out.println("------------------------------------------------------------\nHEAVEN!\n------------------------------------------------------------");
                System.out.println("Everyone must reach toward the sky.");
                System.out.println("The last person to do so has to drink.");
                break;
            case 6://eight
                System.out.println("------------------------------------------------------------\nDATE!\n------------------------------------------------------------");
                System.out.println("Pick a date.");
                System.out.println("They must drink anytime you drink now.");
                break;
            case 7://nine
                System.out.println("------------------------------------------------------------\nBUST A RHYME!\n------------------------------------------------------------");
                System.out.println("Each person must follow with a word that rhymes.");
                System.out.println("First person to fail must drink.");
                break;
            case 8://ten
                System.out.println("------------------------------------------------------------\nCATEGORIES\n------------------------------------------------------------");
                System.out.println("Pick a category and name something from that category.");
                System.out.println("First player to mess up has to drink.");
                break;
            case 9://jack
                System.out.println("------------------------------------------------------------\nNEVER HAVE I EVER\n------------------------------------------------------------");
                System.out.println("Play \"Never Have I Ever\" with five fingers and drink each time you lose a finger.");
                System.out.println("First person to lose all fingers must finish their drink.");
                System.out.println("If multiple people lose all of their fingers they must all finish their drinks.");
                break;
            case 10://queen
                System.out.println("------------------------------------------------------------\nQUESTIONS\n------------------------------------------------------------");
                System.out.println("You must ask the next person a question and they must do the same until someone accidentally answers the question asked.");
                System.out.println("First person to fail must drink.");
                break;
            case 11://king
                System.out.println("------------------------------------------------------------\nMAKE A RULE!\n------------------------------------------------------------");
                System.out.println("You must make a rule that causes people to drink more often.");
                break;
            case 12://ace
                System.out.println("------------------------------------------------------------\nWATERFALL!\n------------------------------------------------------------");
                System.out.println("Everyone must drink until the person before them stops drinking.");
                break;
            default:
                System.out.println("That card does not exist.");
                break;
        }//close switch
        
    }//close showRule method
    
    public void showDeck(){
        do{
            System.out.println();
            deck.displayCard(index);
            showRule();
            userString = input.next();
            index++;
        }while(!userString.equals("quit") && !userString.equals("Quit"));
    }//close showDeck method
    
    public void menu(){
        System.out.println("------------------------------------------------------------\nKINGS\n------------------------------------------------------------");
        System.out.println("-> Between each turn you will have to enter any letter or number to continue to the next card.");
        System.out.println("-> To quit, simply type \"quit\".");
        System.out.println("Would you like to start?");
        userString = input.next();
        if(userString.equals("yes") || userString.equals("Yes") || userString.equals("YES") || userString.equals("Y") || userString.equals("y")){
            showDeck();
        }//close if
        else if(userString.equals("no") || userString.equals("No") || userString.equals("NO") || userString.equals("N") || userString.equals("n")){
            menu();
        }//close else if
        else{
            System.out.println("************************************************************");
            System.out.println("Error: You entered something incorrectly.");
            System.out.println("Please enter some form of \"yes\" or \"no\"");
            System.out.println("************************************************************");
            menu();
        }//close else
    }//close menu method
}//close Game Class
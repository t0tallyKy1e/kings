/*
    Kings Card Game
    Created by t0tallyKy1e
    1/28/2016
    Kings Deck Class
*/

package kings;

import java.util.Random;

public class Deck{
    private final int DECKSIZE = 52;
    private final int MAXSUIT = 4;
    private final int MAXVALUE = 13;//maximum cards per suit
    
    //properties
    private Card[] deck = new Card[DECKSIZE];//52 elements in the array
    private Card[] shuffledDeck = new Card[DECKSIZE];
    
    private Random randGen = new Random(System.currentTimeMillis());
    
    
    //default Constructor
    public Deck(){
        int value = 0;
        int suit = 0;
        
        for(int i = 0; i < DECKSIZE; i++){
            value = i % 13;
            suit = i / 13;
            
            if(suit > 3){
                suit = 3;
            }
            
            deck[i] = new Card(value, suit);
        }//close i loop
        
        
    }//close default Constructor
    
    //shuffle deck
    public void shuffleDeck(){
        int randInt = 0;
        int counter = 0;
        Card tempCard;
        
        for(int end = DECKSIZE; end > 0; end--){
            randInt = randGen.nextInt(end);
            tempCard = deck[randInt];
            
            shuffledDeck[counter] = deck[randInt];
            deck[randInt] = deck[end - 1];
            deck[end-1] = tempCard;
            counter++;
        }//close end for
    }//close shuffleDeck
    
    //display deck
    public void displayDeck(){
        for(int i = 0; i < DECKSIZE; i++){
            deck[i].display();
        }//close for
    }//close displayDeck
    
    //display shuffled deck
    public void displayShuffledDeck(){
        for(int i =0; i < DECKSIZE; i++){
            shuffledDeck[i].display();
        }//close for
    }//close displayShuffledDeck
    
    public Card getShuffledCard(int index){
        return shuffledDeck[index];
    }//close getCard method
    
    //display card from shuffled deck
    public void displayCard(int index){
        shuffledDeck[index].display();
    }//close displayCard method
}//close Deck class
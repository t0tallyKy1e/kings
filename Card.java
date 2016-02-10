
/*
    Kings Card Game
    Created by t0tallyKy1e
    1/28/2016
    Kings Card Class
*/

package kings;

import java.util.Random;

public class Card{
    private final int MAXVALUE = 13;
    private final int MAXSUIT = 3;
    private final Random randGen = new Random(System.currentTimeMillis());
    
    //properties
    private int iCardValue = 0;//0(iCardValue) = Two(sCardValue)...etc
    private int iCardSuit = 0;//0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades
    
    //default Constructor
    public Card(){
        iCardValue = randGen.nextInt(MAXVALUE);
        iCardSuit = randGen.nextInt(MAXSUIT);
    }//close default Constructor
    
    public Card(int tempIntCardValue, int tempIntCardSuit){
        setIntCardValue(tempIntCardValue);
        setIntCardSuit(tempIntCardSuit);
    }//close secondary Constructor
    
    public void setIntCardValue(int tempIntCardValue){
        if(tempIntCardValue > MAXVALUE){
            System.out.println("That card is too high and does not exist.");
        }
        else if(tempIntCardValue < 0){
            System.out.println("That card is too low and does not exist.");
        }
        else{
            iCardValue = tempIntCardValue;
        }
    }//close setIntCardValue

    public int getIntCardValue(){
        return iCardValue;
    }//close getIntCardValue
    
    public String getStringCardValue(int iTempCardValue){
        String sCardValue = " ";
        
        switch(iTempCardValue){
            case 0:
                sCardValue = "Two";
                break;
            case 1:
                sCardValue = "Three";
                break;
            case 2:
                sCardValue = "Four";
                break;
            case 3:
                sCardValue = "Five";
                break;
            case 4:
                sCardValue = "Six";
                break;
            case 5:
                sCardValue = "Seven";
                break;
            case 6:
                sCardValue = "Eight";
                break;
            case 7:
                sCardValue = "Nine";
                break;
            case 8:
                sCardValue = "Ten";
                break;
            case 9:
                sCardValue = "Jack";
                break;
            case 10:
                sCardValue = "Queen";
                break;
            case 11:
                sCardValue = "King";
                break;
            case 12:
                sCardValue = "Ace";
                break;
            default:
                ;//NoP
                break;
        }//close switch
        
        return sCardValue;
    }//close getStringCardValue
    
    public void setIntCardSuit(int tempIntCardSuit){
        if(tempIntCardSuit > MAXSUIT){
            System.out.println("Value entered is too high. Suit does not exist.");
        }
        else if(tempIntCardSuit < 0){
            System.out.println("Value entered is too low. Suit does not exist.");
        }
        else{
            iCardSuit = tempIntCardSuit;
        }
    }//close setIntCardSuit
    
    public int getIntCardSuit(){
        return iCardSuit;
    }//close getCardSuit
    
    public String getStringCardSuit(int iTempCardSuit){
        String sCardSuit = " ";
        switch(iTempCardSuit){
            case 0:
                sCardSuit = "Hearts";
                break;
            case 1:
                sCardSuit = "Diamonds";
                break;
            case 2:
                sCardSuit = "Clubs";
                break;
            case 3:
                sCardSuit = "Spades";
                break;
            default:
                ;//NoP
                break;
        }//close switch
        return sCardSuit;
    }//close getStringCardSuit
    
    public void display(){
        System.out.println(getStringCardValue(iCardValue) + " of " + getStringCardSuit(iCardSuit));
    }//close display
}//close Card Class
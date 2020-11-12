package BlackJack;

import BlackJackBase.PCard;

import java.awt.*;

public class BJCard extends PCard{
    //values
    int rank;
    int suit;
    boolean hidden;

    //card values
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;

    //suits
    public static final int SPADE = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;
    public static final int CLUB = 4;

    //constructors
    public BJCard(int rank, int suit){
        super();
        hidden = false;
        this.rank = rank;
        this.suit = suit;
    }

    //methods
    public int getRank() {
        return rank;
    }
    public int getSuit() {
        return suit;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public void hideCard() {
        hidden = true;
    }

    @Override
    public void showCard() {
        hidden = false;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public String getText() {
        String cSuit = convSuit();
        String cRank = convRank();
        return cRank + cSuit;
    }//public String getText()

    public Color getFontColor() {
        if (suit == 2 || suit == 3){
            return Color.RED;
        }else{
            return Color.BLACK;
        }
    }

    private String convRank(){
        String cRank = "";
        switch (rank){
            case 1:
                cRank = "A";
                break;
            case 11:
                cRank = "J";
                break;
            case 12:
                cRank = "Kn";
                break;
            case 13:
                cRank = "Q";
                break;
            case 14:
                cRank = "K";
                break;
            default:
                cRank = String.valueOf(rank);
                break;
        }//end switch (rank){

        return cRank;
    }//end private String convRank()

    private String convSuit(){
        String cSuit = "";
        switch(suit){
            case 1:
                cSuit = "S";
                break;
            case 2:
                cSuit = "H";
                break;
            case 3:
                cSuit = "D";
                break;
            case 4:
                cSuit = "C";
                break;
        }//end switch(suit){
        return cSuit;
    }

}

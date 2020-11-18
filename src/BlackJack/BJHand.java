package BlackJack;

import BlackJackBase.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BJHand implements PHand {
    //fields
    ArrayList<BJCard> cards;

    //constructors
    public BJHand(){
        cards = new ArrayList<BJCard>();
    }

    //methods

    @Override
    public int getSize() {
        return cards.size();
    }

    @Override
    public void addCard(PCard card) {
        System.out.println("adding card to hand");
        cards.add((BJCard) card);
    }

    @Override
    public PCard getCard(int index) {
        System.out.println("returning card");
        return cards.get(index);    //do we need to validate?
    }

    @Override
    public PCard removeCard(int index) {
        PCard card = this.getCard(index);
        cards.remove(index);
        return card;
    }

    @Override
    public int getValue() {
        //since the aces' values are determined last, we'll configure that last
        int aces=0;
        int sum = 0;
        for(BJCard card: cards){
            if (card.getRank() == 1){
                //if there's an ace, dont sum it just yet, add it to the ace pile
                aces++;
            //if this
            }else if(card.getRank() > 1 && card.getRank() < 10){
                sum += card.getRank();
            }else {
                sum += 10;
            }//end if (card.getRank() == 1)
        }//end for(BJCard card: sortedCards)
        if (aces > 0 && (aces-1)+sum+11>21){
            sum += aces;
        }else if (aces > 0 && (aces-1)+sum+11<=21)
            sum += (aces-1)+11;
        return sum;
    }//end public int getValue()
}

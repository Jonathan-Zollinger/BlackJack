package BlackJackTest;

import BlackJack.BJDeck;
import BlackJack.BJHand;

public class PlayBlackJack {
    public static void main(String[] args) {
        //BJCard card = new BJCard(4,3);
        //CardTest.run(card);
    	BJDeck bjDeck = new BJDeck();
        BJHand bjHand = new BJHand();
    	HandTest.run(bjDeck,bjHand);
    }
}

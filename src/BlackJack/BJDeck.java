package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {
	//attributes
	ArrayList<BJCard> cards;
	
	
	//constructor
	public BJDeck() {
		cards = new ArrayList<BJCard>();
		for (int j = 1; j <= 14; j++) {//loop through all the ranks
			for (int i = 1; i <= 4; i++) {//loop through all the suits
				BJCard card = new BJCard(j,i);
				cards.add(card);//adds new card to the deck with suit and rank from for loops
			}//end of rank for loop
		}//end of suit for loop
	}//end of BJDeck()
	
	
	@Override
	public void shuffle() {
		Collections.shuffle(cards);
	}//end of shuffle()

	@Override
	public void addCard(PCard card) {
		cards.add((BJCard) card);
	}//end of addCard()

	@Override
	public BJCard dealCard() {
		BJCard bjCard;
		if (cards.size() > 0) {
			bjCard = cards.get(cards.size()-1);
			cards.remove(cards.size()-1);
			return bjCard;
		} else {
			return null;
		}//end of if statement
		
	}//end of dealCard()

	@Override
	public BJCard dealHiddenCard() {
		BJCard bjCard;
		if (cards.size() > 0) {
			bjCard = cards.get(cards.size()-1);
			cards.remove(cards.size()-1);
			bjCard.hideCard();
			return bjCard;
		} else {
			return null;
		}//end of if statement
		
	}//end of dealHidenCard()

	@Override
	public int cardCount() {
		return cards.size();
	}//end of cardCount()

}

package com.kita.first.blackjack;

public class Dealer extends Gamer {
	@Override
	public void moreCards(CardDeck cd) {
		
		int stopPoint = 17;
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());
		}
	}
}

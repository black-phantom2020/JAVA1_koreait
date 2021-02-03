package com.kita.first.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();
	// List<이 안 제네릭> : 제약사항, 카드로 넣고 카드로 나오게
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		for(int i=0; i<Card.PATTERNS.length; i++) {
			for(int z=1; z<=13; z++) {
				
				int point = z;
				if(z > 10) {
					point = 10;
				}
				
				
				arr.add(new Card(Card.PATTERNS[i], getDeno(z), point));
			}
		}
	}
	
	private String getDeno(int num) {
		switch(num) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(num);
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}

	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());
		return arr.remove(rIdx);
	}
}

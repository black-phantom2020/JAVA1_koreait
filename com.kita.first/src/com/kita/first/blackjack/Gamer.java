package com.kita.first.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
private List<Card> arr;
	
	public Gamer() {
		arr = new LinkedList();
	}
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public void openCards() { // 내가 가진 카드를 print

		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수:  %d\n", getTotalPoint());
		
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}
	
	public void moreCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			openCards();
			System.out.print("카드를 더 받으시겠습니까? (y/n)");
			String answer = scan.nextLine();

			if(answer.equals("n")) {
				break;
			} else if(answer.equals("y")) {
				receiveCard(cd.getCard());
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		scan.close();
	}
}

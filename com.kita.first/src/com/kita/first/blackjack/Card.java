package com.kita.first.blackjack;

public class Card {
	public final static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final String pattern;
	private final String denomination;
	private final int point;

	public Card(String pattern, String denomination, int point) { //생성자 : 1.클래스명과 이름 같음 2.리턴타입 적으면 안됨
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("p: %s, d: %s", pattern, denomination);
	}
}

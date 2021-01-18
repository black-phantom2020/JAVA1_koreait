package com.kita.first.level2;

public class GalaxyPhone extends Phone {
	String ai_secr;
	
	GalaxyPhone(String name, String color, int memory, String ai_secr) {
		super("삼성", name, color, memory);
		this.ai_secr = ai_secr;
	}
	
	void paySamsungMoney() {
		System.out.println("삼성페이를 사용한다.");
	}
}

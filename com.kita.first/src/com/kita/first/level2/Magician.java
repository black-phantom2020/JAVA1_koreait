package com.kita.first.level2;

public class Magician extends Adventurer {
	int mp;
	
	Magician(int strength, int intellegence
			, int dexterity, int luck, int mp) {
		super(strength, intellegence, dexterity, luck);
		this.mp = mp;
	}
	
	@Override
	void attack() {
		System.out.println("마법공격을 한다.");
	}
	
	void teleport() {
		System.out.println("텔레포트한다.");
	}
	
//	@Override
//	void jump() {
//		System.out.println("마법점프를 한다.");
//	}
	
	
	
	
	
	
	
	
	
	
}

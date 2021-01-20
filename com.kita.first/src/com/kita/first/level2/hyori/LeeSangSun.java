package com.kita.first.level2.hyori;

public class LeeSangSun extends LeeHyoRi {
	LeeSangSun() {
		super("인스타");
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
//		hr.star = 10000000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(10000000);
		
		hr.sing();
		hr.drinkTea();
//		hr.dance();
	}
}







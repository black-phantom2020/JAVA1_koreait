package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi {
	public Hwasa() {
		super("인스타");
		this.music = "";
		this.sns = "";
//		this.star = 12;
//		super.sns = "";
		
		drinkTea();
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
//		hr.sns = "인스타";
//		hr.star = 10000000;
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(10000000);
		
		hr.sing();
//		hr.drinkTea();
//		hr.dance();
		
		
	}
}








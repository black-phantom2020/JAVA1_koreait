package com.kita.first.practice;

public class Practice11 {
	public static void main(String[] args) {
		// 구구단 4단 찍기
		int dan = 4;
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
	}
}

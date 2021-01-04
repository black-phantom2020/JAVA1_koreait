package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		// 1~6 총 6개의 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random() * 6) + 1;
		String menu;
		if(rNum == 1) {
			menu = "한식";
		} else if(rNum == 2) {
			menu = "양식";
		} else if(rNum == 3) {
			menu = "중식";
		} else if(rNum == 4) {
			menu = "일식";
		} else if(rNum == 5) {
			menu = "베트남식";
		} else {
			menu = "멕시코식";
		}
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
	}
}

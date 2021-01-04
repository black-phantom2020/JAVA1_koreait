package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		// 1~6 총 6개의 메뉴 랜덤 뽑기
		int rNum = 3;
		String menu;
		switch(rNum) {
		case 1:
			menu = "한식";
			break;
		case 2: case 4:
			menu = "양식";
			break;
		case 3:
			menu = "일식";
			break;
		default:
			menu = "치킨";
		}
		
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
	}
}

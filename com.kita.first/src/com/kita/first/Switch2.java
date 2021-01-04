package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		String menu;
		
		scan.close();
		switch(sNum) {
		case "일":
			menu = "한식";
			break;
		case "이": case "사":
			menu = "양식";
			break;
		case "삼":
			menu = "일식";
			break;
		default:
			menu = "치킨";
		}
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
	}
}

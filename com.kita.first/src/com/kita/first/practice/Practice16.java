package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		// 1 ~ 6까지 랜덤으로 메뉴 뽑기를 한 번 한 후에! 
		// 뽑힌 메뉴: ㅇㅇ
		// 마음에 들면 Y 눌러서 반복 끝내고 
		// "오늘의 메뉴는 ㅇㅇ입니다"
		// 마음에 안 들면 N 눌러서 다시 랜덤 뽑기
		Scanner sc = new Scanner(System.in);
		String menu;
		do {
			// 메뉴 뽑기
			int rNum = (int)(Math.random() * 6) + 1;
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
			System.out.println("뽑힌 메뉴 : " + menu);
			System.out.print("마음에 듭니까?(Y/N)");
			String result = sc.next();
			if("Y".equals(result)) {
				break;
			}
		} while(true);
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
		
		
		
		
	}
}

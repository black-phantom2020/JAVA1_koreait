package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		// 몇 월인지 입력해주세요.(1~12월)
		// 3~5월 : 봄
		// 6~8월 : 여름
		// 9~11월 : 가을
		// 12~2월 : 겨울
		
		// n월은 ㅇㅇ입니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력해 주세요 : (1~12)");
		
		String month = scan.next();
		scan.close();
		
		int monthNum = Integer.parseInt(month);
		String season = "";
		
		// if문으로 풀기
		if(monthNum >= 3 && monthNum <= 5) {
			season = "봄";
		} else if(monthNum >= 6 && monthNum <= 8) {
			season = "여름";
		} else if(monthNum >= 9 && monthNum <= 11) {
			season = "가을";
		} else if(monthNum == 1 || monthNum == 2 || monthNum == 12) {
			season = "겨울";
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		if(monthNum >= 1 && monthNum <= 12) {
			System.out.printf("%d월은 %s입니다.", monthNum, season);
		}
		
		// switch문으로 풀기
		switch(monthNum) {
			case 3: case 4: case 5:
				season = "봄";
				break;
				
			case 6: case 7: case 8:
				season = "여름";
				break;
			
			case 9: case 10: case 11:
				season = "가을";
				break;
			
			case 1: case 2: case 12:
				season = "겨울";
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
		if(monthNum >= 1 && monthNum <= 12) {
			System.out.printf("%d월은 %s입니다.", monthNum, season);
		}
		
		
		
	}
}

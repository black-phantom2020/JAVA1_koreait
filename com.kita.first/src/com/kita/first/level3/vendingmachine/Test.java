package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
//
//		--메뉴--
//		1. 콜라 900원
//		2. 사이다 700원
//		.
//		.
//		.
//		6. 웰치스 1000원
		
//		메뉴를 입력하세요(0 입력 시 종료): 1
//		콜라 900원
//		메뉴를 입력하세요(0 입력 시 종료): 3
//		캔커피 400원
//		.
//		.
//		.
//		메뉴를 입력하세요(0 입력 시 종료): 0
//		합계: 3700원
		
		
		int len = 6;
		Menu menu = new Menu(len);
		
		// 메뉴, 가격 배열에 값 입력
		
		
		
		
		Scanner scan = new Scanner(System.in);
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		int num;
		int total=0;
		
		// 메뉴판 찍기 기능
		System.out.println("--메뉴--");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		
		// 0입력시까지 반복되는 반복문 기능
		while(true) {
			
			// 번호 입력받는 기능
			System.out.print("메뉴를 입력하세요(0 입력 시 종료): ");
			num = scan.nextInt();
			
			// 입력받은 번호 분기 가르기 기능
			if(num<0 || num>6) {
				System.out.println("범위 내의 숫자를 입력하세요.");
				continue;
			} else if(num == 0) {
				break;
			}
			
			// 합계 합산 기능
			total += priceArr[num-1];
			
			// 입력받은 번호의 음료 내용 프린트 기능
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
			
		}
		scan.close();
		
		// 합계 찍어주는 기능
		System.out.printf("합계: %d원\n", total);

	}
}








package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

import com.kita.first.level3.Utils;

public class Menu {
	// 필드
	private String[] menuArr;
	private int[] priceArr;
	
	
	// 생성자
	public Menu(int len) {
		menuArr = new String[len];
		priceArr = new int[len];
		System.out.printf("%d칸짜리 배열이 생성되었습니다.\n", len);
	}
	
	// 메소드
	// 메뉴배열에 메뉴이름 집어넣기
	public void setMenuItem(int index, String item) {
		menuArr[index] = item;
	}
	
	// 가격배열에 메뉴가격 집어넣기
	public void setMenuPrice(int index, int price) {
		priceArr[index] = price;
	}
	
	// 메뉴배열의 index번째 문자열 값 리턴
	public String getMenuItem(int index) {
		return menuArr[index];
	}
	// 가격배열의 index번째 int 값 리턴
	public int getMenuPrice(int index) {
		return priceArr[index];
	}
	
	// 메뉴배열에 순차적으로 값 입력
	void inputArrItems() {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d번째 메뉴 이름 입력: ", i+1);
			String str = scan.next();
			menuArr[i] = str;
		}
	}
	
	// 가격배열에 순차적으로 값 입력
	void inputArrPrices() {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<priceArr.length; i++) {
			System.out.printf("%d번째 메뉴 가격 입력: ", i+1);
			int num = scan.nextInt();
//			if(num == 0) {
//				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
//				i--;
//				continue;
//			}
			priceArr[i] = num;
		}
	}
}













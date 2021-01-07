package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		// 컴퓨터가 뽑은 랜덤 수 (10~90)
		// Up&Down
		// Great!
		Scanner sc = new Scanner(System.in);
		int max = 90;
		int min = 10;
		int rNum = (int)(Math.random() * (max-min+1))+min;
		
		
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			if(num > max || num < min) {
				System.out.println("잘못 입력하였습니다.");
			} else if(num < rNum) {
				System.out.println("Up");
			} else if(num > rNum) {
				System.out.println("Down");
			} else {
				break;
			}
		}
		sc.close();
		System.out.println("Great!");
		
		
	}
}

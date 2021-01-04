package com.kita.first.practice;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		
		String opt = "";
		int mod = score % 10; // 1의 자리수 얻기
		if (mod >= 7) {
			opt = "+";
		} else if (mod <= 3) {
			opt = "-";
		}
		
		switch (score / 10) { // 10의 자리수 얻기
		case 10: 
			System.out.print("A+");
			break; // 가장 가까운 하나의 조건문이나 반복문에서 나가기
		case 9:
			System.out.print("A" + opt);
			break;
		case 8:
			System.out.println("B" + opt);
			break;
		case 7:
			System.out.println("C" + opt);
			break;
		default:
			System.out.print("D");
		}
		
		
		
		
		
	}
}

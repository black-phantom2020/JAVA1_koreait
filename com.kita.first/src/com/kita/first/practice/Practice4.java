package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
//		스캐너로 정수값 하나 입력 받고
//		그 값이 홀수면 "홀수입니다."
//		짝수면 "짝수입니다."
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "짝수";
		
		if(num % 2 == 1) { str = "홀수"; }
		
		System.out.printf("%s입니다.", str);
		
		
		
	}
}

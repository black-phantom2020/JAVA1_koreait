package com.kita.first.level3.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자만 입력하시오: ");
		String result = scan.next();
		int num;
		try {
			// 문자열 정수로 변환 시도
			num = Integer.parseInt(result);
		} catch(Exception e) {
			// 변환 실패 출력
//			e.printStackTrace();
			num = 0;
			System.out.println("변환 실패");
		}
		System.out.println("num: " + num);
	}
}





package com.kita.first;

public class Random {
	public static void main(String[] args) {
		int num = (int)Math.random(); // 0~1사이의 난수를 하나 발생
									// 0 <= num < 1
		System.out.println(num);
		
		int num2 = (int)(Math.random() * 10); // 0 <= num * 10 < 10
											// 0, 1, 2, ..., 9   0~9
		System.out.println(num2);
		
		int num3 = (int)(Math.random() * 10); // 1~10
												// 1 <= num * 10 + 1 < 11
		System.out.println(num3);
	}
}

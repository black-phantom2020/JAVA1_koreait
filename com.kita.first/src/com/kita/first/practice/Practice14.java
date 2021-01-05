package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		// 구구단 가로로 정렬
		
		for(int i=1; i<10; i++) {
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %2d\t", dan, i, (dan*i));
			}
			System.out.println();
		}
	}
}

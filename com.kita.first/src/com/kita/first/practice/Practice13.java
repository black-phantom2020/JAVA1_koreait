package com.kita.first.practice;

public class Practice13 {
	public static void main(String[] args) {
		// 2~9단 세로로 쭉~~~
		// 단! 단이 하나 바뀔 때 추가로 개행 한 번 더
		
		for(int dan=2; dan<10; dan++) {
			for(int z=1; z<10; z++) {
				System.out.printf("%d * %d = %d\n", dan, z, (dan*z));
			}
			System.out.println();
		}
	}
}

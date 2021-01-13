package com.kita.first.level2.practice2;

public class Practice01 {
	public static void main(String[] args) {
		Practice01 pr = new Practice01();
		pr.printGugudan(2);
		
		for(int i=2; i<10; i++) {
			pr.printGugudan(i);
		}
	}
	
	void printGugudan(int num) {
		// 구구단 출력
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}
}

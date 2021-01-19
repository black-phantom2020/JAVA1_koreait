package com.kita.first.level2.pack1;

public class FinalStatic {
	final int N1;
	static final int N2 = 4;
	int n3 = 1;
	
	FinalStatic(int n1, int n2) {
		this.N1 = n1;
		printNum(n1);
		n3 = n2;
	}
	
	static void printNum(int input) {
		System.out.println(input);
//		System.out.println(n3);
//		call();
	}
	
	void call() {
		System.out.println("안녕");
	}
	
	
	
	
	
	
	
}

package com.kita.first.level2.practice2;

public class Practice02 {
	public static void main(String[] args) {
		int n1 = sum(5, 6);
		int n2 = minus(4, 7);
		int n3 = multiply(n1, n2);
		double n4 = divide(5, 3);
		
		int n5 = sum(5, 6, 7);
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);
		
		
	}
	
	static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int sum(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	static double divide(int n1, int n2) {
		double result = (double)n1 / n2;
		return result;
	}
	
	
	

}

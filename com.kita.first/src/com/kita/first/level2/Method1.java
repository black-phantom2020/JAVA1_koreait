package com.kita.first.level2;

public class Method1 {
//	static void 메소드명(매개변수) {
//		
//	}
//	
//	리턴타입 메소드명(매개변수...) {
//		return 리턴타입 변수;
//	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n1 = sum(3, 4);
//		int n2 = sum(arr);
		int n3 = sum(1, 4, 6, 7, 4, 3, 6, 78, 8);
		
		System.out.println(n1);
//		System.out.println(n2);
	}
	static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
//	static int sum(int[] arr) {
//		int result = 0;
//		for(int i=0; i<arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
//	}
	
	static int sum(int... arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
//	static int sum(int n1, int... arr) {
//		int result = 0;
//		for(int i=0; i<arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
//	}
//	
//	static int sum(int n1, int n2, int... arr) {
//		int result = 0;
//		for(int i=0; i<arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
//	}
	
	static int sum(String str, int... arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
}

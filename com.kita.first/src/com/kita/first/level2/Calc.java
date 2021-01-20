package com.kita.first.level2;

public class Calc {
	// 필드
//	static int n1 = 1;
//	final int N2 = 3;
	// 생성자
	
	// 메소드
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		myCalc.powerOn();
		
		int num = myCalc.sum(2, 3);
		System.out.println(num);
		
		System.out.println("3 / 2 = " + myCalc.divide(3, 2));
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	int minus(int n1, int n2) {
		int result;
		if(n1 < n2) {
			result = n2 - n1;
		} else {
			result = n1 - n2;			
		}
		return result;
	}
	
	int multiply(int n1, int n2) {
		return n1 * n2;
	}
	
	double divide(int n1, int n2) {
		double result = (double)n1 / n2;
		return result;
	} // 나누기
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

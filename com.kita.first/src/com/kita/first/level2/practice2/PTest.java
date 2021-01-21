package com.kita.first.level2.practice2;

public class PTest {
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김땡땡", 20);
		myP.setName("김냥냥");
		
		// 이름, 나이 출력 printf사용
		String myPName = myP.getName();
		int myPAge = myP.getAge();
		
		System.out.printf("이름: %s, 나이: %d", myPName, myPAge);
	}
}

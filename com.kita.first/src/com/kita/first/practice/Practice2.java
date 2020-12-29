package com.kita.first.practice;

public class Practice2 {
	public static void main(String[] args) {
		/*
		 * name
		 * age
		 * vision
		 * bloodType
		 * 
		 * 제 이름은 ㅇㅇㅇ이고 나이는 ㅇㅇ살입니다.
		 * 시력은 ㅇ.ㅇ이고 혈액형은 ㅇ형입니다.
		 * */
		
		String name = "박연진";
		int age = 345;
		float vision = 0.1f;
		char bloodType = 'A';
		
		System.out.print("제 이름은 "+name+"이고 나이는 "+age+"살입니다.\n");
		System.out.println("시력은 "+vision+"이고 혈액형은 "+bloodType+"형입니다.");
		
		System.out.printf("제 이름은 %s이고 나이는 %s살입니다.\n시력은 %s이고 혈액형은 %s형입니다.", name, age, vision, bloodType);
		
		
		
	}
}

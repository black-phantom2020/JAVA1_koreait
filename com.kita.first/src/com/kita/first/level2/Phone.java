package com.kita.first.level2;

public class Phone {
	// 필드
	String company = "삼성";
	String name;
	String color;
	int memory;
	
	// 생성자
	Phone() {}
	
	Phone(String name) {
		this(name, "검은색", 200);
	}
	
	Phone(String name, String color) {
		this(name, color, 200);
	}
	
	Phone(String name, String color, int memory) {// 필드를 초기화
		this.name = name;
		this.color = color;
		this.memory = memory;
	}
	
	
	// 메소드
	String sendMsg(String str) {
		String result = str;
		
		if("".equals(str)) {
			String blank = "";
			result = blank;
		}
		System.out.println(result);
		return result;
	}
	
	void call() {
		
	}
}







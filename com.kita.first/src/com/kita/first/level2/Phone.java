package com.kita.first.level2;

public class Phone extends Object {
	// 필드
	String company;
	String name;
	String color;
	int memory;
	
	// 생성자
	Phone() {
		super();
	}
	
	Phone(String company) {
		this(company, "휴대폰", "검은색", 200);
	}
	
	Phone(String company, String name) {
		this(company, name, "검은색", 200);
	}
	
	Phone(String company, String name, String color) {
		this(company, name, color, 200);
	}
	
	Phone(String company, String name, String color, int memory) {// 필드를 초기화
		this.company = company;
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





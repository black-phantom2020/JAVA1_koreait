package com.kita.first.level3;

public class Student {
	Book book1 = new Book(2);
	Book book2 = new Book(3);
	Book book3 = new Book(4);
	
	int readBooks() {
		boolean result1 = book1.read();
		if(false == result1) {
			stopRead();
			return 1;
		}
		if(false == book2.read()) {
			stopRead();
			return 2;
		}
		if(false == book3.read()) {
			stopRead();
			return 3;
		}
		return 0;
	}
	
	void stopRead() {
		System.out.println("책을 그만 읽습니다.");
	}
}




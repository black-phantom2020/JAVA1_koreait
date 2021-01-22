package com.kita.first.level3;

public class MajorTextBook extends Book {
	public MajorTextBook(int maxChapter) {
		super(maxChapter);
	}
	
	@Override
	boolean read() {
		++chapter;
		if(chapter < maxChapter) {
			System.out.println("전공서적을 읽는다.");
			return true;
		}
		System.out.println("전공서적을 이미 다 읽었다.");
		return false;
	}
}


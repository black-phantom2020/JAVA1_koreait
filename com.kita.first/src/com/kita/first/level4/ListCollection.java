package com.kita.first.level4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		// Card
		List<String> list = new ArrayList<String>();
//		int[] arr = new int[5];
		list.add("안녕");
		list.add("하세요");
		list.add(2, "저는");
		list.set(0, "하이");
		list.remove(2);
		String result = list.get(1);
		System.out.println("result: " + result);
		
		
		
		List<Cd> shelf = new LinkedList<Cd>();
		Cd cd1 = new Cd("에잇", "아이유", 2019);
		Cd cd2 = new Cd("항해", "악동뮤지션", 2020);
		shelf.add(cd1);
		shelf.add(cd2);
		shelf.add(cd2);
	}
}









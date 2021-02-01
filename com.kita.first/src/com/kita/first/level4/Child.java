package com.kita.first.level4;

public class Child extends Parent {
	Parent childField  = new Parent() {
		@Override
		void parentMethod() {
			System.out.println("재정의합니다.");
		}
	};
	
	void childMethod() {
		Parent childVar  = new Parent() {
			@Override
			void parentMethod() {
				System.out.println("재정의합니다.");
			}
		};
		childVar.parentMethod();
	};
	
	void childMethod2(Parent parent) {
		
	}
}






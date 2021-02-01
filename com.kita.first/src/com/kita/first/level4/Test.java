package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent() {
			@Override
			void parentMethod() {
				System.out.println("자식 객체입니다.");
			};
		};
		p.parentMethod();
		Child child = new Child();
		child.childMethod();
		child.childMethod2(new Parent() {
			@Override
			void parentMethod() {};
		});
		
//		Parent p = new Child();
//		p.parentMethod();
		
//		ThrowsException2 te2 = new ThrowsException2();
//		try {
//			te2.method1();			
//		} catch(Exception e) {
//			
//		}
		
//		AkmuAlbum album1 = new MusicPlayer();
//		IUAlbum album2 = new MusicPlayer();
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
//		album2.playIUAlbum();
//		album2.stopIUAlbum();
//		
//		MusicPlayer myMp3 = (MusicPlayer)album1;
//		myMp3.playMichaelJacksonAlbum();
	}
}







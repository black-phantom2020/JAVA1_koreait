package com.kita.first.level4;

public class MusicPlayer implements AkmuAlbum, IUAlbum {
	@Override
	public void playAkmuAlbum() {
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void stopAkmuAlbum() {
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void playIUAlbum() {
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	
	@Override
	public void stopIUAlbum() {
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	
	public void playMichaelJacksonAlbum() {
		System.out.println("beat it! 앨범을 재생합니다.");
	}
}







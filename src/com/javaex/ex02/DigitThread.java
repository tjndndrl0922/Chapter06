package com.javaex.ex02;

public class DigitThread extends Thread {

	// 필드

	// 생성자

	// 메소드 g/s

	// 메소드 일반
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.print(i);
		}
	}

}

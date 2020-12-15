package com.javaex.ex04;

public class UpperRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				System.out.print(ch);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
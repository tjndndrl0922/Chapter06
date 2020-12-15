package com.javaex.ex04;

public class DigitRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				System.out.print(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// TODO Auto-generated method stub

	}

}

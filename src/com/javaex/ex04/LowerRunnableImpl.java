package com.javaex.ex04;

public class LowerRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {

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

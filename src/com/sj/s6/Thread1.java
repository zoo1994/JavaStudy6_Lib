package com.sj.s6;

public class Thread1 extends Thread {
	@Override
	public void run() {
		 for (int i=0;i<10;i++) {
			Thread.sleep(500);
			 System.out.println("i : "+i);
		 }
	}
}

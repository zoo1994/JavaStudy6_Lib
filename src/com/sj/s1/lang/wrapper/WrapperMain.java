package com.sj.s1.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		WrapperEx1 ex1 = new WrapperEx1();
		int num=10;
		
		Integer n = Integer.valueOf(num);
		
		num = n.intValue();
		ex1.ex1();
	}

}

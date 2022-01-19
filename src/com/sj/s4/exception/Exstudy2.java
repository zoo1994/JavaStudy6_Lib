package com.sj.s4.exception;

public class Exstudy2 {

	public void ex2() {
		//유치원생 - 2자릿수까지 읽기 가능
		
		int num = 70;
		int num2 = 50;
		int num3 = num+num2;
		int num4 = num2-num;
		
		try {
		if ( num3 > 99) {
			throw new ChildException("3자리수 몰라요");
		}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Message : "+e.getMessage());
			
		}
		
		
		
		
	}

}

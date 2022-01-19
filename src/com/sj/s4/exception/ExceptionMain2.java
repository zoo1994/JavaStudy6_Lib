package com.sj.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 10;

		try {
			int result = num2 / num1;
		} catch (Exception exception) {
			//세부적인 컨트롤 작성은 어려움
			exception.printStackTrace();
			System.out.println("오류가 발생하였습니다.");
			num1 = 1;
		}
		int result = num2 / num1;
		System.out.println(result);

	}

}

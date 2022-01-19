package com.sj.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exstudy1 {

	public void ex1() throws InputMismatchException, ArithmeticException, Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int num2 = 10;
		int num3 = num2 / num;
		System.out.println(num3);
	}
}

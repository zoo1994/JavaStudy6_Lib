package com.sj.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	private Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 키보드로부터 주민등록번호 입력
		// 나이를 대충 계산
		// 남자? 여자?
		// 3-5 계절봄 6~8 여름 9~11 가을 12~2 겨울

		System.out.println("주민등록번호를 입력하세요");
		String a = sc.next();
		int age = Integer.parseInt(a.substring(0, 2));
		int cheak = Integer.parseInt(a.substring(7, 8));
		String s = null;
		if (cheak == 1 || cheak == 2) {
			age = 2022 - (1900 + age) + 1;
		} else {
			age = 2022 - (2000 + age) + 1;
		}
		if (cheak == 1 || cheak == 3) {
			s = "남자";
		} else if (cheak == 2 || cheak == 4) {
			s = "여자";
		} else {
			s = "잘못된 입력값입니다.";
		}
		int cheak1 = Integer.parseInt(a.substring(2, 4));
		String s1 = null;
		if (cheak1 >= 3 && cheak1 <= 5) {
			s1 = "봄";
		} else if (cheak1 >= 6 && cheak1 <= 8) {
			s1 = "여름";
		} else if (cheak1 >= 9 && cheak1 <= 11) {
			s1 = "가을";
		} else {
			s1 = "겨울";
		}

		System.out.println("나이 : " + age);
		System.out.println("성별 : " + s);
		System.out.println("계절 : " + s1);
	}

	public void ex2() {
		// 9 7 1 2 2 4 - 1 2 3 4 5 6 7
		// 2 3 4 5 6 7 8 9 2 3 4 5 cheak
		// 결과를 더함 ex)122
		// 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 122/11 = 나머지1
		// 11로 나눈 나머지값을 11에서 빼고 그 값이 cheak용 번호랑 같은지 계산
		// 결과값이 두자리면 다시 결과값을 10으로 나누어 그 나머지값이 체크용 번호랑 같은지 비교
		// 같으면 정상적인 주민번호 아니면 잘못된 번호
		System.out.println("주민등록번호를 입력하세요");
		String a = sc.next();
		int[] aa = new int[14];
		for (int i = 0; i < a.length(); i++) {
			if (a.substring(i, i + 1).equals("-")) {
				continue;
			} else {
				int aaa = Integer.parseInt(a.substring(i, i + 1));
				aa[i] = aaa;
			}
		}
		int sum = aa[0] * 2 + aa[1] * 3 + aa[2] * 4 + aa[3] * 5 + aa[4] * 6 + aa[5] * 7 + aa[7] * 8 + aa[8] * 9
				+ aa[9] * 2 + aa[10] * 3 + aa[11] * 4 + aa[12] * 5;
		sum = 11 - sum % 11;
		if (sum >= 10) {
			sum = sum % 10;
		}
		boolean cheak = sum == aa[13];
		if (cheak) {
			System.out.println("정상적인 주민등록번호");
		} else {
			System.out.println("정상적이지 않은 주민등록번호");
		}

	}

}

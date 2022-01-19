package com.sj.s3.ex4.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		// calendar는 추상클래스
		// GregorianCalendar가 Calendar클래스를 상속
		//Calendar의 메서드는 GregoranCalendar에 있다
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar caledar = new GregorianCalendar();
		
		int y = gc.get(gc.YEAR);
		int m = gc.get(gc.MONTH);
		int d = gc.get(gc.DATE);
		int h = gc.get(gc.HOUR_OF_DAY);
		int min = gc.get(gc.MINUTE);
		int ma = gc.get(gc.MILLISECOND);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(ma);
	}

}

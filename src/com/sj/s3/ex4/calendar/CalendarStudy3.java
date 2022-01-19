package com.sj.s3.ex4.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		//현재시간
		//태어난 날
		//흐른 날
		//나이
		
		GregorianCalendar gc = new GregorianCalendar();
		Calendar ca = gc.getInstance();
		Calendar me = gc.getInstance();
		me.set(1994, 11, 12);
		System.out.println(ca.getTime());
		System.out.println(me.getTime());
		long ca1 =ca.getTimeInMillis();
		long me1 = me.getTimeInMillis();
		long result = ca1-me1;
		long result1 = result/(1000*60*60*24);
		System.out.println(result1/365.2425);
		

		
	}

}

package com.sj.s3.ex4.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Calendar ca = gc.getInstance();
		Calendar ca1 = gc.getInstance();
		ca1.set(Calendar.HOUR_OF_DAY, 17);
		
		System.out.println(ca.getTime());
		System.out.println(ca1.getTime());
		
		long l1 = ca.getTimeInMillis();
		long l2 = ca1.getTimeInMillis();
		
		long result = l2-l1 ;
		
		System.out.println(result);
		
	
		
		
			
	}

}

package com.sj.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderStudy4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		time = time+1000*60*30;
		ca.setTimeInMillis(time);
		
		String pattern = "yyy년MM월dd일 - HH:mm;ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r = sd.format(ca.getTime());
		
		sd.applyPattern(pattern);
		
	}

}

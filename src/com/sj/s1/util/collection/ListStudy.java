package com.sj.s1.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
	
	public List<String> study4() {
		LinkedList<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		return list;
	}
	
	public void study3() {
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		int num = (int)ar.get(0);
		String name = (String)ar.get(3);
		
	}
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n = num ; //autoBoxing
		ar.add(n);
		ar.add(1); // autoBoxing
		
		
	}
	
	
	
	public void study1() {
		int[] numbers = new int[3];
		ArrayList ar = new ArrayList();

		// 배열
		numbers[0] = 1;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}
}

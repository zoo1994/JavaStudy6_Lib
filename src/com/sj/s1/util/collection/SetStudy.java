package com.sj.s1.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {

	public void Study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}

	}

	public void Study3() {
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while (hs.size() != 6) {

			hs.add(random.nextInt(45) + 1);

		}
		System.out.println(hs);
	}

	public void Study2() {
		//이중for
		Random random = new Random();
		int num = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			num = random.nextInt(45) + 1;
			for (int a = 0 ; a <6 ; a++) {
				if(al.get(i)!=num) {
					al.add(i,num);
				}
			}
			
		}

		System.out.println(al);

	}

	public void study() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.remove(2);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);

		System.out.println(ar.size());
		System.out.println(ar);
		System.out.println(hs);
		System.out.println(hs.size());

	}

}

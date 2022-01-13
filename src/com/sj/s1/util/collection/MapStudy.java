package com.sj.s1.util.collection;

import java.util.HashMap;

public class MapStudy {

	public void study1() {
		//hashmap
		HashMap<String, Integer> map = new HashMap<>();
		//put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 1);
		
		
		
		Integer a =map.get("f2");
		System.out.println(a);
		map.remove("f3");
		System.out.println(map);
		
		
	}
}

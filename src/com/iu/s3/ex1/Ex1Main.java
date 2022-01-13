package com.iu.s3.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.iu.s3.ex1.member.MemberDTO;
import com.iu.s3.ex1.member.MemberData;
import com.iu.s3.ex1.student.StudentDTO;
import com.iu.s3.ex1.student.StudentData;


public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData =  new MemberData();
		StudentData studentData = new StudentData();
		//회원들의 정보 모음
		ArrayList <MemberDTO> al = memberData.ini();
		Map<String, StudentDTO>hm = studentData.addStudent(al);
		Set<String> keys = hm.keySet();
		Iterator<String> k = keys.iterator();
		while(k.hasNext()) {
			String key = k.next();
			StudentDTO sd = hm.get(key);
			System.out.println("Key : "+key);
			System.out.println(sd.getId());
			System.out.println(sd.getName());
			System.out.println(sd.getKor());
			System.out.println(sd.getEng());
			System.out.println(sd.getMath());
			System.out.println(sd.getTotal());
			System.out.println(sd.getAvg());
		}
//		for(int i = 0; i<al.size();i++) {
//			System.out.println("이름 : "+hm.get(al.get(i).getId()).getName());
//			System.out.println("ID : "+hm.get(al.get(i).getId()).getId());
//			System.out.println("국어점수 : "+hm.get(al.get(i).getId()).getKor());
//			System.out.println("영어점수 : "+hm.get(al.get(i).getId()).getEng());
//			System.out.println("수학점수 : "+hm.get(al.get(i).getId()).getMath());
//			System.out.println("합계 : "+hm.get(al.get(i).getId()).getTotal());
//			System.out.println("평균 : "+hm.get(al.get(i).getId()).getAvg());
//			
//		}
	}

}

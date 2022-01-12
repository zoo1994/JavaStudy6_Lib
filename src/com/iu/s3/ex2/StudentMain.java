package com.iu.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		StudentData sd = new StudentData();
		ArrayList <StudentDTO> al = sd.test();
		sd.addst(al);
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i).getName());
			System.out.println(al.get(i).getNum());
			System.out.println(al.get(i).getKor());
			System.out.println(al.get(i).getEng());
			System.out.println(al.get(i).getMath());
			System.out.println(al.get(i).getTotal());
			System.out.println(al.get(i).getAvg());
		}
		

	}

}
